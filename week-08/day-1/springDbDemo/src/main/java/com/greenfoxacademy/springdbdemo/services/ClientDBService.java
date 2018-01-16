package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.factories.UserFactory;
import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import com.greenfoxacademy.springdbdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientDBService implements UserService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  UserFactory userFactory;

  @Override
  public List<User> users() {
    List<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }
  
  public List<Client> clients() {
    List<Client> clients = new ArrayList<>();
    userRepository.findAll().forEach(clients::add);
    return clients;
  }

  public List<Hairdresser> hairdressers() {
    List<Hairdresser> hairdressers = new ArrayList<>();
    userRepository.findAll().forEach(hairdressers::add);
    return hairdressers;
  }


  @Override
  public Client getClient(int id) {
    return userRepository.findOne(id);
  }

  @Override
  public void modifyClientData(Client client) {
    userRepository.save(client);
  }

  @Override
  public void create(Client client) {
    userRepository.save(client);
  }

  @Override
  public void delete(int id) {
    userRepository.delete(id);
  }

  @Override
  public Client findOneClient(String emailAddress) {
    for (Client client : clients()) {
      if (client.getEmail().equals(emailAddress)) {
        return client;
      }
    }
    return userFactory.getClient();
  }

  @Override
  public boolean login(Client client) {
    if (!clients().contains(client)) {
      return false;
    }
    return true;
  }

  @Override
  public void register(Client client) {
    Client newClient = userFactory.getClient();
    newClient.setPhoneNumber(client.getPhoneNumber());
    newClient.setEmail(client.getEmail());
    newClient.setName(client.getName());
    clients().add(newClient);
  }
}