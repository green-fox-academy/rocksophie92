package com.greenfoxacademy.bank.controllers;

import com.greenfoxacademy.bank.models.User;
import com.greenfoxacademy.bank.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

  UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users/{userName}")
  public String showUserPage(Model model, @PathVariable String userName) {
    User user = userService.findUser(userName);
    model.addAttribute("user", user);
    return "user_profile";
  }
}
