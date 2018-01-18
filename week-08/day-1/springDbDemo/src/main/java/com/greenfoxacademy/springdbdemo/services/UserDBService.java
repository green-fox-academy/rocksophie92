package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.factories.UserFactory;
import com.greenfoxacademy.springdbdemo.models.Appointment;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.repositories.AppointmentRepository;
import com.greenfoxacademy.springdbdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserDBService implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserDBService(UserRepository userRepository) {
    this.userRepository = userRepository;

  }

  @Override
  public boolean isAlreadyUser(User user) {
    return users().contains(user);
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
    return userRepository.findByEmail(emailAddress);
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
  public void register(User user) {
    userRepository.save(user);
  }

  @Override
  public void modifyUserData(User user) {
    userRepository.save(user);
  }
}
