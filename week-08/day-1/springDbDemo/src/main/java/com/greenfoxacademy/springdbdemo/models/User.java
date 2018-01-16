package com.greenfoxacademy.springdbdemo.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user")
public class User {

  int id;
  String name;
  String email;
  String phoneNumber;
  String userType;

  @OneToOne(targetEntity = User.class)
  private Appointment appointment;

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

  @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
  public Appointment getAppointment() {
    return appointment;
  }

  public void setAppointment(Appointment appointment) {
    this.appointment = appointment;
  }
}
