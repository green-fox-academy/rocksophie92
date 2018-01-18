package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.collections.HairdresserProperties;
import com.greenfoxacademy.springdbdemo.collections.Users;
import com.greenfoxacademy.springdbdemo.factories.UserFactory;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

  private UserService userService;
  private UserFactory userFactory;
  private Users users;
  private HairdresserProperties hairdresserProperties;

  @Autowired
  public RegisterController(UserService userService, UserFactory userFactory, Users users, HairdresserProperties hairdresserProperties) {
    this.userService = userService;
    this.userFactory = userFactory;
    this.users = users;
    this.hairdresserProperties = hairdresserProperties;
  }

  @GetMapping(value = "/checkpoint")
  public String showCheckpoint() {
    return "checkpoint";
  }

  @GetMapping(value = "/register_client")
  public ModelAndView showRegister() {
    ModelAndView m = new ModelAndView("register_client");
    m.addObject("user", userFactory.getUser());
    return m;
  }

  @PostMapping(value = "/register_client")
  public String userRegister(@ModelAttribute User user) {
    user.setUserType("hairdresser");
    userService.register(user);
    return "redirect:/appointments";
  }

  @GetMapping(value = "/register_hairdresser")
  public ModelAndView showHairdresserRegister() {
    ModelAndView m = new ModelAndView("register_hairdresser");
    m.addObject("hairdresser", userFactory.getHairdresser());
    m.addObject("hairdresserLevels", hairdresserProperties.getHairdresserLevelList());
    m.addObject("workingHours", hairdresserProperties.getWorkingHours());
    return m;
  }

  @PostMapping(value = "/register_hairdresser")
  public String hairdresserRegister(@ModelAttribute Hairdresser hairdresser) {
    hairdresser.setUserType("hairdresser");
    userService.register(hairdresser);
    return "redirect:/appointments";
  }
}
