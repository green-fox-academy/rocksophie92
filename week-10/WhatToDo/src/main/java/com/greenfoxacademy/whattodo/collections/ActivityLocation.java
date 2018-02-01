package com.greenfoxacademy.whattodo.collections;

public enum ActivityLocation {

  CITY_OUTDOORS("city outdoors"),
  PUB("pub"),
  COUNTRYSIDE("countryside"),
  HOME("home"),
  GYM("gym"),
  OFFICE("office");

  String location;

  ActivityLocation(String location) {
    this.location = location;
  }


}
