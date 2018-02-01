package com.greenfoxacademy.whattodo.controllers;

import com.greenfoxacademy.whattodo.factories.ActivityFactory;
import com.greenfoxacademy.whattodo.models.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

  @Autowired
  ActivityFactory activityFactory;
  private boolean isClickedAlready = false;

  @PostMapping(value = "/random_activity")
  public String showRandomGenerator() {
    isClickedAlready = true;
    return "redirect:/randomresult";
  }

  @GetMapping(value = "/randomresult")
  public String showRandomResult(Model model) {
    if (isClickedAlready) {
      model.addAttribute("activity", activityFactory.getRandomActivity());
    } else {
      model.addAttribute("activity", new Activity(""));
    }
   return "random_generator";
  }
}
