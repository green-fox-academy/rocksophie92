package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

  private ClientRepository clientRepository;

  @Autowired
  public ClientServiceImpl(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;

  }

  @Override
  public boolean isAlreadyClient(Client client) {
    return clients().contains(client);
  }

  @Override
  public List<Client> clients() {
    List<Client> clients = new ArrayList<>();
    clientRepository.findAll().forEach(clients::add);
    return clients;
  }

  @Override
  public Client getClient(int id) {
    return clientRepository.findOne(id);
  }

  @Override
  public Client findOne(String emailAddress) {
    return clientRepository.findByEmail(emailAddress);
  }

  @Override
  public void create(Client client) {
    clientRepository.save(client);
  }

  @Override
  public void delete(int id) {
    clientRepository.delete(id);
  }

  @Override
  public void register(Client client) {
    clientRepository.save(client);
  }

  @Override
  public void modifyUserData(Client client) {
    clientRepository.save(client);
  }
}
