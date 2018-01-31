package com.greenfoxacademy.retake.controllers;

import com.greenfoxacademy.retake.models.Cart;
import com.greenfoxacademy.retake.models.Textile;
import com.greenfoxacademy.retake.services.TextileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TextileController {

  private int quantity;
  private Cart cart;
  private List<Textile> orders;
  @Autowired
  TextileService textileService;

  @GetMapping(value = "/warehouse")
  public String showListOfClothes(Model model) {
    model.addAttribute("textiles", textileService.findAll());
    model.addAttribute("itemNames", textileService.uniqueItemNames());
    model.addAttribute("sizes", textileService.uniqueSizes());
    return "index";
  }

  @PostMapping(value = "/warehouse")
  public String orderNewItems(@ModelAttribute(value = "itemName") String itemName,
                              @ModelAttribute(value = "size") String size,
                              @ModelAttribute(value = "quantity") Integer quantity) {
    this.quantity = quantity;
    cart = new Cart();
    orders = cart.filLCart(textileService.filterByItemNameAndSize(itemName, size).get(0));
    return "redirect:/summary";
  }

  @GetMapping(value = "/summary")
  public String showMyListOfClothes(Model model) {
    model.addAttribute("orders", orders);
    model.addAttribute("quantity", quantity);
    model.addAttribute("subTotal", cart.countSubTotal(quantity, orders.get(0).getUnitPrice()));
    return "summary";
  }
}
