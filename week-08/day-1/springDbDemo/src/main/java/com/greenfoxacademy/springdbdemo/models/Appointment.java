package com.greenfoxacademy.springdbdemo.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private Date date;
  private Date duration;

  @OneToOne(targetEntity = User.class)
  private User user;


  public Appointment() {
  }

  public Appointment(int id, Date date, Date duration, double priceInHUF, Client client, Hairdresser hairdresser) {
    this.id = id;
    this.date = date;
    this.user = user;
    this.duration = duration;
  }

  public int getId() {
    return id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDuration() {
    return duration;
  }

  public void setDuration(Date duration) {
    this.duration = duration;
  }

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "appointment")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
