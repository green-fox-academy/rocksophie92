package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Client;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ClientService {

  List<Client> clients();

  Client getClient(int id);

  Client findOne(String emailAddress);

  void create(Client client);

  void delete(int id);

  void register(Client client);

  void modifyUserData(Client client);

  boolean isAlreadyClient(Client client);
}
