package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.User;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;


@Service
public class AppointmentService {

  Date endDate;

  public Date calculateEndDate(Appointment appointment, long durationInHours) {
    long endDateInLong = appointment.getDate().getTime() + (3600000 * durationInHours);
    endDate = new Date(endDateInLong);
    appointment.setEndDate(endDate);
    System.out.println(endDate);
    return appointment.getEndDate();
  }


}
