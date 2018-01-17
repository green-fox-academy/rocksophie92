package com.greenfoxacademy.springdbdemo.collections;

public enum WorkingTimes {

  EIGHT("8:00"),
  NINE("9:00"),
  TEN("10:00"),
  ELEVEN("11:00"),
  TWELVE("12:00"),
  THIRTEEN("13:00"),
  FOURTEEN("14:00"),
  FIFTEEN("15:00"),
  SIXTEEN("16:00"),
  SEVENTEEN("17:00"),
  EIGHTTEEN("18:00"),
  NINETEEN("19:00"),
  TWENTY("20:00");

  String workingTime;

  WorkingTimes(String workingTime) {
    this.workingTime = workingTime;
  }
}
