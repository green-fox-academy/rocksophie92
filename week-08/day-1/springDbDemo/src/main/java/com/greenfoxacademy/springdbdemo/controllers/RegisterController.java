package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.collections.HairdresserLevels;
import com.greenfoxacademy.springdbdemo.collections.Users;
import com.greenfoxacademy.springdbdemo.factories.UserFactory;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

  private UserService userService;
  private UserFactory userFactory;
  private Users users;
  private HairdresserLevels hairdresserLevels;

  @Autowired
  public RegisterController(UserService userService, UserFactory userFactory, Users users, HairdresserLevels hairdresserLevels) {
    this.userService = userService;
    this.userFactory = userFactory;
    this.users = users;
    this.hairdresserLevels = hairdresserLevels;
  }

  @GetMapping(value = "/register")
  public ModelAndView showRegister() {
    ModelAndView m = new ModelAndView("register");
    m.addObject("user", userFactory.getUser());
    m.addObject("userTypes", users.getUserTypes());
    return m;
  }

  @PostMapping(value = "/register")
  public String userRegister(@ModelAttribute User user) {
    userService.register(user);
    if (user.getUserType() == "hairdresser") {
      return "redirect:/register_hairdresser/" + user.getId();
    } else {
      return "redirect:/appointments";
    }
  }

  @GetMapping(value = "/register_hairdresser/{id)")
  public ModelAndView showHairdresserRegister(@PathVariable int id) {
    ModelAndView m = new ModelAndView("register_hairdresser");
    User user = userService.getUser(id);
    m.addObject("newHairdresser", userFactory.getHairdresser());
    m.addObject("hairdresserLevels", hairdresserLevels.getHairdresserLevelList());
    return m;
  }

  @PostMapping(value = "/register_hairdresser")
  public String hairdresserRegister(Model model, @ModelAttribute Hairdresser hairdresser) {
    userService.register(hairdresser);
    model.addAttribute("hairdresser", hairdresser);
    model.addAttribute("hairdresserLevels", hairdresserLevels.getHairdresserLevelList());
    return "redirect:/appointments";
  }
}
