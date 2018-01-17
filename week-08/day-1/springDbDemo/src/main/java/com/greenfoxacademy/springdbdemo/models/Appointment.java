package com.greenfoxacademy.springdbdemo.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {

  private int id;
  private Date date;
  private Date endDate;
  private long duration;
  private User user;
  private Hairdresser hairdresser;

  public Appointment() {
  }

  public Appointment(Date date, long duration, User user) {
    this.date = date;
    this.duration = duration;
    this.user = user;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Temporal(TemporalType.TIMESTAMP)
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public long getDuration() {
    return duration;
  }

  public void setDuration(long duration) {
    duration = 2;
    this.duration = duration;
  }

  @Temporal(TemporalType.TIMESTAMP)
  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate() {
    long endDateInLong = getDate().getTime() + (3600000 * duration);
    this.endDate = new Date(endDateInLong);
  }

  @ManyToOne(fetch = FetchType.LAZY)
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  public Hairdresser getHairdresser() {
    return hairdresser;
  }

  public void setHairdresser(Hairdresser hairdresser) {
    this.hairdresser = hairdresser;
  }
}
