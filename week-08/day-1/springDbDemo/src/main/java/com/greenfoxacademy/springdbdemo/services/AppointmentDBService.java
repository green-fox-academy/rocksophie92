package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class AppointmentDBService implements AppointmentService {


  private AppointmentRepository appointmentRepository;

  @Autowired
  public AppointmentDBService(AppointmentRepository appointmentRepository) {
    this.appointmentRepository = appointmentRepository;
  }

  @Override
  public Collection<Appointment> appointments(Appointment appointment, User user) {
    Collection<Appointment> appointments = new ArrayList<>();
    appointmentRepository.findAll().forEach(appointments::add);
    return appointments;
  }

  @Override
  public Appointment getAppointment(int id) {
    return appointmentRepository.findOne(id);
  }

  @Override
  public Appointment findOne(Hairdresser hairdresser) {
    return appointmentRepository.findByHairdresser(hairdresser);
  }

  @Override
  public void create(Appointment appointment) {
    appointmentRepository.save(appointment);
  }

  @Override
  public void delete(int id) {
    appointmentRepository.delete(id);
  }

  @Override
  public void modifyAppointmentData(Appointment appointment) {
    appointmentRepository.save(appointment);
  }
}
