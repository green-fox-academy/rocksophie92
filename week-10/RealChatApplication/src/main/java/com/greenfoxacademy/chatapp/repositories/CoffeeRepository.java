package com.greenfoxacademy.chatapp.repositories;

import com.greenfoxacademy.chatapp.models.Coffee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, Integer> {

  List<Coffee> findDistinctByTypeAndSource(String type, String source);

  @Query(value = "SELECT DISTINCT source FROM coffees", nativeQuery = true)
  List<String> getDistinctCoffeeSources();
}
