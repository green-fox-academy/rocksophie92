package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.factories.UserFactory;
import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.services.UserDBService;
import com.greenfoxacademy.springdbdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

  @Autowired
  UserService userService;

  @Autowired
  UserDBService userDBService;

  @Autowired
  UserFactory userFactory;

  @Autowired
  public LoginController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login")
  public ModelAndView showLogin() {
    ModelAndView m = new ModelAndView("login");
    m.addObject("user", userFactory.getUser());
    return m;
  }

  @PostMapping(value = "/login")
  public ModelAndView addUser(@ModelAttribute User user) {
    userService.login(user);
    if (userDBService.isAlreadyUser) {
      return new ModelAndView("redirect:/appointments");
    } else {
      return new ModelAndView("redirect:/register");
    }
  }

  @GetMapping(value = "/register")
  public ModelAndView showRegister() {
    ModelAndView m = new ModelAndView("register");
    m.addObject("user", userFactory.getUser());
    return m;
  }

  @PostMapping(value = "/register")
  public String userRegister(Model model, @ModelAttribute User user) {
    userService.register(user);
    model.addAttribute("user", user);
    return "redirect:/appointments";
  }

  @GetMapping(value = "/appointments")
  public String listAppointments(Model model, @ModelAttribute("appointment") Appointment appointment, @ModelAttribute("hairdresser")Hairdresser hairdresser) {
    model.addAttribute("appointment", appointment);
    return "appointments";
  }

  @PostMapping(value = "/book")
  public String addAppointment(@Valid @ModelAttribute("appointment") Appointment appointment, @ModelAttribute("user") User user, @ModelAttribute("hairdresser") Hairdresser hairdresser, BindingResult bindingResult) {
  /*  if (bindingResult.hasErrors()) {
      return "redirect:/appointments";
    }*/
    userDBService.appointments(appointment, user);
    return "redirect:/appointments";
  }
}
