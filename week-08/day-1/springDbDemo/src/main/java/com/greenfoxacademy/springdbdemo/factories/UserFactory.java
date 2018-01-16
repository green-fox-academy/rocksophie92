package com.greenfoxacademy.springdbdemo.factories;

import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

  User user;

  public User getClient() {
    User client = new Client();
    return client;
  }

  public User getHairdresser() {
    User hairdresser = new Hairdresser();
    return hairdresser;
  }
}
