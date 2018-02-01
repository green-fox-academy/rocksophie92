package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.Coffee;
import com.greenfoxacademy.chatapp.repositories.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CoffeeService {

  @Autowired
  CoffeeRepository coffeeRepository;

  public List<String> listAllCoffeeTypes() {
    List<String> types = new ArrayList<>(Arrays.asList("arabica", "robusta", "caffeine-free"));
    return types;
  }

  public Coffee findOne(Integer id) {
    return coffeeRepository.findOne(id);
  }

  public List<Coffee> findAll() {
    return (List<Coffee>) coffeeRepository.findAll();
  }

  public List<Coffee> filterByTypeAndSource(String type, String source) {
    return coffeeRepository.findDistinctByTypeAndSource(type, source);
  }

  public void deleteCoffeeFromDb(Coffee coffee) {
    coffeeRepository.delete(coffee);
  }

  public List<String> listAllTeaSources() {
    return coffeeRepository.getDistinctCoffeeSources();
  }

  public void save(Coffee coffee) {
    coffeeRepository.save(coffee);
  }
}
