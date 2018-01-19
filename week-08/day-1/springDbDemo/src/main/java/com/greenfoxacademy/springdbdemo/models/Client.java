package com.greenfoxacademy.springdbdemo.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Client {

  private int id;
  private String name;
  private String email;
  private String phoneNumber;
  private String userType;

  private Collection<Appointment> appointments;

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

  @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
  public Collection<Appointment> getAppointments() {
    return appointments;
  }

  public void setAppointments(Collection<Appointment> appointments) {
    this.appointments = appointments;
  }
}
