package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.factories.UserFactory;
import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserDBService implements UserService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  UserFactory userFactory;

  public boolean isAlreadyUser;

  public boolean getIsAlreadyUser() {
    return isAlreadyUser;
  }

  public void setIsAlreadyUser(boolean isAlreadyUser) {
    isAlreadyUser = isAlreadyUser;
  }

  @Override
  public List<User> users() {
    List<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

  @Override
  public User getUser(int id) {
    return userRepository.findOne(id);
  }

  @Override
  public User findOne(String emailAddress) {
    for (User user : users()) {
      if (user.getEmail().equals(emailAddress)) {
        return user;
      }
    }
    return userFactory.getUser();
  }

  @Override
  public void create(User user) {
    userRepository.save(user);
  }

  @Override
  public void delete(int id) {
    userRepository.delete(id);
  }

  @Override
  public void login(User user) {
    if (!users().contains(user)) {
      setIsAlreadyUser(false);
    } else {
      setIsAlreadyUser(true);
    }
  }

  @Override
  public void register(User user) {
    User newUser = userFactory.getUser();
    newUser.setPhoneNumber(user.getPhoneNumber());
    newUser.setEmail(user.getEmail());
    newUser.setName(user.getName());
    users().add(newUser);
  }

  @Override
  public void modifyUserData(User user) {
    userRepository.save(user);
  }

  public Collection<Appointment> appointments(Appointment appointment, User user) {
    user.getAppointments().add(appointment);
    return user.getAppointments();
  }
}
