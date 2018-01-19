package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.factories.ClientFactory;
import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  private ClientService clientService;
  private ClientFactory clientFactory;

  @Autowired
  public LoginController(ClientService clientService, ClientFactory clientFactory) {
    this.clientService = clientService;
    this.clientFactory = clientFactory;
  }

  @GetMapping("/login")
  public ModelAndView showLogin() {
    ModelAndView m = new ModelAndView("login");
    m.addObject("client", clientFactory.getClient());
    return m;
  }

  @PostMapping(value = "/login")
  public ModelAndView addUser(@ModelAttribute Client client) {
    if (clientService.findOne(client.getEmail()) != null) {
      return new ModelAndView("redirect:/appointments");
    } else {
      return new ModelAndView("redirect:/checkpoint");
    }
  }
}
