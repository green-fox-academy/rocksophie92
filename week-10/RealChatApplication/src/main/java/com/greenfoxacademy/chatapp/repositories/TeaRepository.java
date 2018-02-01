package com.greenfoxacademy.chatapp.repositories;

import com.greenfoxacademy.chatapp.models.Tea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeaRepository extends CrudRepository<Tea, Integer> {
}
