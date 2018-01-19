package com.greenfoxacademy.springdbdemo.repositories;

import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HairdresserRepository extends CrudRepository<Hairdresser, Integer>{

  Hairdresser findByEmail(String email);
}
