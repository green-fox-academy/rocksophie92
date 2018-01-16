package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.models.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {

  List<User> users();
  Client getClient(int id);
  boolean login(Client client);
  Client findOneClient(String emailAddress);
  Hairdresser findOneHairdresser(String emailAddress);
  void register(Client client);
  void modifyClientData(Client client);
  void create(Client client);
  void delete(int id);


}
