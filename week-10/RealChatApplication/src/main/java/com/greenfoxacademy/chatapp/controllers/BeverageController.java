package com.greenfoxacademy.chatapp.controllers;

import com.greenfoxacademy.chatapp.models.Coffee;
import com.greenfoxacademy.chatapp.models.Tea;
import com.greenfoxacademy.chatapp.services.BeverageService;
import com.greenfoxacademy.chatapp.services.CoffeeService;
import com.greenfoxacademy.chatapp.services.TeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BeverageController {

  private List<Tea> teas;
  private List<Coffee> coffees;

  @Autowired
  CoffeeService coffeeService;
  @Autowired
  BeverageService beverageService;
  @Autowired
  TeaService teaService;

  public BeverageController() {
    this.coffees = new ArrayList<>();
  }

  @GetMapping(value = "/choice")
  public String showChoices(Model model, @RequestParam(value = "beverage", required = false) String beverage) {
    model.addAttribute("beverages", beverageService.populateBeverages());
    return "choice";
  }

  @PostMapping(value = "/choice")
  public String sendChoice(@ModelAttribute(value = "beverage") String beverage) {
    String returnStatement;
    if (beverage == null) {
      returnStatement = "error_no_coffee";
    } else {
      returnStatement = "redirect:/" + beverage + "_order";
    }
    return returnStatement;
  }

  @GetMapping(value = "/coffee_order")
  public String showCoffeeOrderForm(Model model) {
    model.addAttribute("types", coffeeService.listAllCoffeeTypes());
    model.addAttribute("sources", coffeeService.listAllTeaSources());
    return "index_coffee";
  }

  @PostMapping(value = "/coffee_order")
  public String buyCoffee(@ModelAttribute(value = "type") String type,
                          @ModelAttribute(value = "source") String source) {
    String returnStatement;
    Coffee chosenCoffee = coffeeService.filterByTypeAndSource(type, source).get(0);
    if (chosenCoffee == null) {
      returnStatement = "error_no_coffee";
    } else {
      if (chosenCoffee.getAmount() <= 0) {
        coffeeService.deleteCoffeeFromDb(chosenCoffee);
        returnStatement = "error_no_coffee";
      } else {
        chosenCoffee.setAmount(chosenCoffee.getAmount() - 1);
        coffees.add(chosenCoffee);
        coffeeService.save(chosenCoffee);
        returnStatement = "redirect:/coffee_list";
      }
    }
    return returnStatement;
  }

  @GetMapping(value = "/coffee_list")
  public String showMyCoffees(Model model) {
    model.addAttribute("coffees", coffees);
    return "coffee_list";
  }

  @GetMapping(value = "/tea_order")
  public String showTeaOrderForm(Model model) {
    model.addAttribute("types", teaService.listAllTeaTypes());
    model.addAttribute("sources", teaService.listAllTeaSources());
    return "index_tea";
  }

  @PostMapping(value = "/tea_order")
  public String buyTea(@ModelAttribute(value = "type") String type,
                       @ModelAttribute(value = "source") String source,
                       @ModelAttribute(value = "amount") int amount) {
    Tea tea = new Tea(type, source, amount);
    teas = new ArrayList<>();
    teas.add(tea);
    teaService.addTea(tea);
    return "redirect:/tea_list";
  }

  @GetMapping(value = "/tea_list")
  public String showMyTeas(Model model) {
    model.addAttribute("teas", teaService.findAll());
    return "tea_list";
  }
}
