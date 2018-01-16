package com.greenfoxacademy.springdbdemo.factories;

import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

  User user;

  public Client getClient() {
    Client client = new Client();
    return client;
  }

  public Hairdresser getHairdresser() {
    Hairdresser hairdresser = new Hairdresser();
    return hairdresser;
  }

  public User getUser() {
    User user = new User();
    return user;
  }
}
