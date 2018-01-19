package com.greenfoxacademy.springdbdemo.factories;

import com.greenfoxacademy.springdbdemo.models.Client;
import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import org.springframework.stereotype.Component;

@Component
public class ClientFactory {

  public Client getClient() {
    Client client = new Client();
    return client;
  }
}
