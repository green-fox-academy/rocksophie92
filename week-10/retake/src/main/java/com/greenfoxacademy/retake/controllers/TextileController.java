package com.greenfoxacademy.retake.controllers;

import com.greenfoxacademy.retake.models.ItemName;
import com.greenfoxacademy.retake.models.MyTextile;
import com.greenfoxacademy.retake.models.MyTextilesList;
import com.greenfoxacademy.retake.models.Textile;
import com.greenfoxacademy.retake.services.TextileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TextileController {

  @Autowired
  TextileService textileService;
  ItemName itemName;
  @Autowired
  MyTextilesList myTextilesList;

  List<MyTextile> myClothes;

  @GetMapping(value = "/warehouse")
  public String showListOfClothes(Model model) {
    model.addAttribute("textiles", textileService.findAll());
    return "index";
  }

  @PostMapping(value = "/warehouse")
  public String orderNewItems(@RequestParam(value = "itemName") String itemName,
                              @RequestParam(value = "size") String size,
                              @RequestParam(value = "quantity") int quantity,
                              @RequestAttribute(value = "textile") Textile textile,
                              Model model){
    model.addAttribute("itemName", itemName);
    model.addAttribute("size", size);
    model.addAttribute("itemNames", textileService.findAll());
    model.addAttribute("sizes", textileService.findAll());

    myClothes = textileService.myOrderedTextiles(textileService.getTextileByName(itemName), size, quantity);

return "redirect:/summary";
  }

  @GetMapping(value = "/summary")
  public String showMyListOfClothes(Model model) {
    model.addAttribute("myTextiles", myClothes);
    return "summary";
  }
}
