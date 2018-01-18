package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.factories.UserFactory;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  private UserService userService;
  private UserFactory userFactory;

  @Autowired
  public LoginController(UserService userService, UserFactory userFactory) {
    this.userService = userService;
    this.userFactory = userFactory;
  }

  @GetMapping("/login")
  public ModelAndView showLogin() {
    ModelAndView m = new ModelAndView("login");
    m.addObject("user", userFactory.getUser());
    return m;
  }

  @PostMapping(value = "/login")
  public ModelAndView addUser(@ModelAttribute User user) {
    if (userService.findOne(user.getEmail()) != null) {
      return new ModelAndView("redirect:/appointments");
    } else {
      return new ModelAndView("redirect:/checkpoint");
    }
  }
}
