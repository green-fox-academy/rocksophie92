package com.greenfoxacademy.bank.services;

import com.greenfoxacademy.bank.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private List<User> users;

  public User login(User user) {
    if (!users.contains(user)) {
      register(user);
      return user;
    } else {
      return user;
    }
  }

  private void register(User user) {
    users.add(user);
  }

  public List<User> listAllUsers() {
    return users;
  }

  public User findUser(String userName) {
    for (User user : users) {
      if (user.getName().equals(userName)) {
        return user;
      }
    }
    User user = new User();
    user.setName(userName);
    register(user);
    return user;
  }
}