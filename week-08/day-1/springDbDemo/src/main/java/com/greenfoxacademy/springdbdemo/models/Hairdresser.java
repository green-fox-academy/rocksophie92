package com.greenfoxacademy.springdbdemo.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Hairdresser extends User {

  private String level;
  private Date workStart;
  private Date workEnd;

  public Hairdresser() {
  }

  public Hairdresser(String level, Date workStart, Date workEnd) {
    super();
    this.level = level;
    this.workStart = workStart;
    this.workEnd = workEnd;
  }

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

  public Date getWorkStart() {
    return workStart;
  }

  public void setWorkStart(Date workStart) {
    this.workStart = workStart;
  }

  public Date getWorkEnd() {
    return workEnd;
  }

  public void setWorkEnd(Date workEnd) {
    this.workEnd = workEnd;
  }

}
