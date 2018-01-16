package com.greenfoxacademy.springdbdemo.collections;

import com.greenfoxacademy.springdbdemo.models.User;

import java.util.Arrays;
import java.util.List;

public class Users {

  public List<String> userTypes;

  public Users() {
    userTypes = Arrays.asList("Client", "Hairdresser");
  }

  public List<String> getUserTypes() {
    return userTypes;
  }
}
