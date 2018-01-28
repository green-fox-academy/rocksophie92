package com.greenfoxacademy.bank.controllers;

import com.greenfoxacademy.bank.models.User;
import com.greenfoxacademy.bank.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  UserService userService;

  @Autowired
  public LoginController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login")
  public String showLogin(Model model) {
    model.addAttribute("user", new User());
    return "login";
  }

  @PostMapping("/login")
  private ModelAndView handleLogin(Model model, @ModelAttribute User user) {
    User loggedInUser = userService.login(user);
    model.addAttribute("user", loggedInUser);
    return new ModelAndView("redirect:/users/" + user.getName());
  }
}
