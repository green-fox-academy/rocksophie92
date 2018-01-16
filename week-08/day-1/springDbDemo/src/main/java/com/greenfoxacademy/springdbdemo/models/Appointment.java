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

  @ManyToOne(targetEntity = Client.class)
  private Client client;

  @ManyToOne(targetEntity = Hairdresser.class)
  private Hairdresser hairdresser;

  public Appointment() {
  }

  public Appointment(int id, Date date, Date duration, double priceInHUF, Client client, Hairdresser hairdresser) {
    this.id = id;
    this.date = date;
    this.client = client;
    this.hairdresser = hairdresser;
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

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "client")
  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  public Hairdresser getHairdresser() {
    return hairdresser;
  }

  public void setHairdresser(Hairdresser hairdresser) {
    this.hairdresser = hairdresser;
  }
}
