package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {

  List<User> users();
  User getUser(int id);
  User findOne(String emailAddress);
  void create(User user);
  void delete(int id);
  void register(User user);
  void modifyUserData(User user);
  boolean isAlreadyUser(User user);
}
