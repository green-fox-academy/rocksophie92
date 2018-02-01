package com.greenfoxacademy.whattodo.models;

import javax.persistence.*;

@Entity
@Table(name = "activities")
public class Activity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String mood;
  private String location;
  private String price;
  private int maxPersons;

  public Activity() {
  }

  public Activity(String name) {
    this.name = name;
  }

  public Activity(String name, String mood, String location, String price, int maxPersons) {

    this.name = name;
    this.mood = mood;
    this.location = location;
    this.price = price;
    this.maxPersons = maxPersons;
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

  public String getMood() {
    return mood;
  }

  public void setMood(String mood) {
    this.mood = mood;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public int getMaxPersons() {
    return maxPersons;
  }

  public void setMaxPersons(int maxPersons) {
    this.maxPersons = maxPersons;
  }
}
