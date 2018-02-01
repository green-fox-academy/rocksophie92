package com.greenfoxacademy.chatapp.models;

import javax.persistence.*;

@Entity
@Table(name = "teas")
public class Tea {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String type;
  private String source;
  private int amount;

  public Tea() {
  }

  public Tea(String type, String source, int amount) {

    this.type = type;
    this.source = source;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
