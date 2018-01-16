package com.greenfoxacademy.springdbdemo.repositories;

import com.greenfoxacademy.springdbdemo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
