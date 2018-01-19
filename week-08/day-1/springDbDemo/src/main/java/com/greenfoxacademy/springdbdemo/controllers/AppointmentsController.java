package com.greenfoxacademy.springdbdemo.controllers;

import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AppointmentsController {

  private AppointmentService appointmentService;

  @Autowired
  public AppointmentsController(AppointmentService appointmentService) {
    this.appointmentService = appointmentService;
  }

  @GetMapping(value = "/appointments")
  public String listAppointments(Model model, @ModelAttribute("appointment") Appointment appointment, @ModelAttribute("hairdresser") Hairdresser hairdresser) {
    model.addAttribute("appointment", appointment);
    return "appointments";
  }

  @PostMapping(value = "/book")
  public String addAppointment(@Valid @ModelAttribute("appointment") Appointment appointment, @ModelAttribute Client client, @ModelAttribute("hairdresser") Hairdresser hairdresser) {
    appointmentService.appointments(appointment, client);
    return "redirect:/appointments";
  }
}
