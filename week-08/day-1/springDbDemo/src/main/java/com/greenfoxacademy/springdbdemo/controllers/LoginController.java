package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

  UserService userService;

  @Autowired
  public LoginController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login_page")
  public String showLogin(Model model) {
    model.addAttribute("client", new Client());
    return "login_client";
  }

  @PostMapping(value = "/login")
  public String clientLogin(Model model, @ModelAttribute Client client) {
    model.addAttribute("client", userService.findOne(client.getEmail()));
    if (userService.login(client)) {
      return "redirect:/appointments";
    } else {
      return "redirect:/register";
    }
  }

  @PostMapping(value = "/register")
  public String clientRegister(Model model, @ModelAttribute Client client) {
    userService.register(client);
    model.addAttribute("client", client);
    return "appointments_list";
  }

  @GetMapping(value="/appointments")
  public String listAppointments(Model model, @ModelAttribute Appointment appointment) {
    model.addAttribute("appointment", appointment);
    return "appointments_list";
  }
}
