package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.Tea;
import com.greenfoxacademy.chatapp.repositories.TeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TeaService {

  @Autowired
  TeaRepository teaRepository;

  public Tea addTea(Tea tea) {
    return teaRepository.save(tea);
  }

  public List<String> listAllTeaTypes() {
    List<String> teaTypes = new ArrayList<>(Arrays.asList("black", "white", "green", "fruit", "oolong"));
    return teaTypes;
  }

  public List<String> listAllTeaSources() {
    List<String> teaSources = new ArrayList<>(Arrays.asList("Sri Lanka", "China", "India", "Turkey", "Kenya"));
    return teaSources;
  }

  public List<Tea> findAll() {
    return (List<Tea>) teaRepository.findAll();
  }
}

