package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  @GetMapping("/listMyRecipes")
  public void hiSayer(Model model, @RequestParam(value ="name", required = false) String name) {
    if (name == null) {
      name = "world";
    } else {
      model.addAttribute("name", name);
    }
  }
}
