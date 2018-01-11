package com.greenfoxacademy.utilities.controllers;

import com.greenfoxacademy.utilities.services.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;

@Controller
public class WebController {

  Button button;
  Color color;

  @Autowired
  ColorService colorService;

  @RequestMapping(value = "/useful")
  public String usefulLinks(Model model) {
    model.addAttribute("color", colorService.setRandomColor(color));
    return "main_page";
  }
}
