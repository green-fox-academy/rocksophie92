package com.greenfoxacademy.springdbdemo.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "hairdresser")
public class Hairdresser {

  private String level;
  private int workStart;
  private int workEnd;
  private Collection<Appointment> appointments;
  private int id;
  private String name;
  private String email;
  private String phoneNumber;
  private String userType;

  public Hairdresser() {
  }

  public Hairdresser(String level, int workStart, int workEnd, Collection<Appointment> appointments, int id, String name, String email, String phoneNumber, String userType) {
    this.level = level;
    this.workStart = workStart;
    this.workEnd = workEnd;
    this.appointments = appointments;
    this.id = id;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.userType = userType;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public int getWorkStart() {
    return workStart;
  }

  public void setWorkStart(int workStart) {
    this.workStart = workStart;
  }

  public int getWorkEnd() {
    return workEnd;
  }

  public void setWorkEnd(int workEnd) {
    this.workEnd = workEnd;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  @OneToMany(mappedBy = "hairdresser", cascade = CascadeType.ALL)
  public Collection<Appointment> getAppointments() {
    return appointments;
  }


  public void setAppointments(Collection<Appointment> appointments) {
    this.appointments = appointments;
  }
}
