package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.collections.HairdresserProperties;
import com.greenfoxacademy.springdbdemo.collections.Users;
import com.greenfoxacademy.springdbdemo.factories.UserFactory;
import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.services.UserDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AppointmentsController {

  @Autowired
  UserDBService userDBService;
  @Autowired
  UserFactory userFactory;
  @Autowired
  Users users;
  @Autowired
  HairdresserProperties hairdresserProperties;


  @GetMapping(value = "/appointments")
  public String listAppointments(Model model, @ModelAttribute("appointment") Appointment appointment, @ModelAttribute("hairdresser") Hairdresser hairdresser) {
    model.addAttribute("appointment", appointment);
    return "appointments";
  }

  @PostMapping(value = "/book")
  public String addAppointment(@Valid @ModelAttribute("appointment") Appointment appointment, @ModelAttribute("user") User user, @ModelAttribute("hairdresser") Hairdresser hairdresser, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "redirect:/appointments";
    }
    userDBService.appointments(appointment, user);
    return "redirect:/appointments";
  }
}
