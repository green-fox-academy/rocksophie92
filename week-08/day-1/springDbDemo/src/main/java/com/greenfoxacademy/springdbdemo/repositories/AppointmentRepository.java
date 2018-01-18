package com.greenfoxacademy.springdbdemo.repositories;

import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {

  Appointment findByHairdresser(Hairdresser hairdresser);
}
