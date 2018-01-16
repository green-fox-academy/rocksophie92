package com.greenfoxacademy.springdbdemo.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "client")
public class Client extends User{

  private String phoneNumber;

  public Client() {
    super();
  }

  public Client(String name, String phoneNumber, String email) {
    super();
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
  public Collection<Appointment> getAppointments() {
    return appointments;
  }

  public void setAppointments(Collection<Appointment> appointments) {
    this.appointments = appointments;
  }
}
