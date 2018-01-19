package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public interface AppointmentService {

  Collection<Appointment> appointments(Appointment appointment, Client client);

  Appointment getAppointment(int id);

  Appointment findOne(Hairdresser hairdresser);

  void create(Appointment appointment);

  void delete(int id);

  void modifyAppointmentData(Appointment appointment);

}
