package com.example.restapitest.models;

public class Appender {

  String stringThatLacksAnA;

  public Appender() {
  }

  public Appender(String stringThatLacksAnA) {
    this.stringThatLacksAnA = stringThatLacksAnA;
  }

  public String getStringThatLacksAnA() {
    return stringThatLacksAnA;
  }

  public void setStringThatLacksAnA(String stringThatLacksAnA) {
    this.stringThatLacksAnA = stringThatLacksAnA;
  }
}
