package com.greenfoxacademy.springdbdemo.repositories;

import com.greenfoxacademy.springdbdemo.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

  Client findByEmail(String email);
}
