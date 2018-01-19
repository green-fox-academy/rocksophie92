package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.collections.HairdresserProperties;
import com.greenfoxacademy.springdbdemo.factories.ClientFactory;
import com.greenfoxacademy.springdbdemo.factories.HairdresserFactory;
import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.services.ClientService;
import com.greenfoxacademy.springdbdemo.services.HairdresserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

  private ClientService clientService;
  private HairdresserService hairdresserService;
  private ClientFactory clientFactory;
  private HairdresserFactory hairdresserFactory;
  private HairdresserProperties hairdresserProperties;

  @Autowired
  public RegisterController(ClientService clientService, ClientFactory clientFactory, HairdresserProperties hairdresserProperties, HairdresserFactory hairdresserFactory) {
    this.clientService = clientService;
    this.clientFactory = clientFactory;
    this.hairdresserProperties = hairdresserProperties;
    this.hairdresserFactory = hairdresserFactory;
  }

  @GetMapping(value = "/checkpoint")
  public String showCheckpoint() {
    return "checkpoint";
  }

  @GetMapping(value = "/register_client")
  public ModelAndView showRegister() {
    ModelAndView m = new ModelAndView("register_client");
    m.addObject("client", clientFactory.getClient());
    return m;
  }

  @PostMapping(value = "/register_client")
  public String clientRegister(@ModelAttribute Client client) {
    client.setUserType("client");
    clientService.register(client);
    return "redirect:/appointments";
  }

  @GetMapping(value = "/register_hairdresser")
  public ModelAndView showHairdresserRegister() {
    ModelAndView m = new ModelAndView("register_hairdresser");
    m.addObject("hairdresser", hairdresserFactory.getHairdresser());
    m.addObject("hairdresserLevels", hairdresserProperties.getHairdresserLevelList());
    m.addObject("workingHours", hairdresserProperties.getWorkingHours());
    return m;
  }

  @PostMapping(value = "/register_hairdresser")
  public String hairdresserRegister(@ModelAttribute Hairdresser hairdresser) {
    hairdresser.setUserType("hairdresser");
    hairdresserService.register(hairdresser);
    return "redirect:/appointments";
  }
}
