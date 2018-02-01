package com.greenfoxacademy.chatapp.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BeverageService {

  public List<String> populateBeverages() {
    return new ArrayList<>(Arrays.asList("coffee", "tea"));
  }
}
