package com.greenfoxacademy.springdbdemo.models;

import java.util.Collection;

public abstract class User {

  int id;
  String name;
  String email;
  Collection<Appointment> appointments;
}
