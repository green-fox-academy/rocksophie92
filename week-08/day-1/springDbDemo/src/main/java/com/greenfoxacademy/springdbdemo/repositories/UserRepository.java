package com.greenfoxacademy.springdbdemo.repositories;

import com.greenfoxacademy.springdbdemo.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Client, Integer> {
}
