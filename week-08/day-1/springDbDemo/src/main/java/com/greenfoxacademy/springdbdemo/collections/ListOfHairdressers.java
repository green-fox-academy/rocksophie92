package com.greenfoxacademy.springdbdemo.collections;

public enum ListOfHairdressers {

  LOLKA("Lolka"),
  BOLKA("Bolka"),
  FURKESZ("Furkesz"),
  MANO("Mano");

  String hairdresserName;

  ListOfHairdressers(String hairdresserName) {
    this.hairdresserName = hairdresserName;
  }
}
