package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface AppointmentService {

  Collection<Appointment> appointments(Appointment appointment, User user);

  Appointment getAppointment(int id);

  Appointment findOne(Hairdresser hairdresser);

  void create(Appointment appointment);

  void delete(int id);

  void modifyAppointmentData(Appointment appointment);

}
