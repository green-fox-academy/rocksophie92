package com.greenfoxacademy.springdbdemo.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "hairdresser")
public class Hairdresser extends User {

  private String name;
  private String level;
  private Date workStart;
  private Date workEnd;
  private Collection<Appointment> appointments;

  public Hairdresser() {
  }

  public Hairdresser(String level, Date workStart, Date workEnd, String name) {
    super();
    this.name = name;
    this.level = level;
    this.workStart = workStart;
    this.workEnd = workEnd;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  @Column
  public Date getWorkStart() {
    return workStart;
  }

  public void setWorkStart(Date workStart) {
    this.workStart = workStart;
  }

  @Column
  public Date getWorkEnd() {
    return workEnd;
  }

  public void setWorkEnd(Date workEnd) {
    this.workEnd = workEnd;
  }

  @OneToMany(mappedBy = "hairdresser", cascade = CascadeType.ALL)
  public Collection<Appointment> getAppointments() {
    return appointments;
  }


  public void setAppointments(Collection<Appointment> appointments) {
    this.appointments = appointments;
  }
}
