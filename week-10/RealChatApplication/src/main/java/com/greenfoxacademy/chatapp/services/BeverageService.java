package com.greenfoxacademy.chatapp.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BeverageService {

  public List<String> populateBeverages() {
    List<String> beverages = new ArrayList<>(Arrays.asList("coffee", "tea"));
    return beverages;
  }
}
