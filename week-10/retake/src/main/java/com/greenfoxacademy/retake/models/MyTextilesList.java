package com.greenfoxacademy.retake.models;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTextilesList {

  private List<MyTextile> myTextiles;

  public MyTextilesList() {
  }

  public MyTextilesList(List<MyTextile> myTextiles) {
    this.myTextiles = myTextiles;
  }

  public List<MyTextile> getMyTextiles() {
    return myTextiles;
  }

  public void setMyTextiles(List<MyTextile> myTextiles) {
    this.myTextiles = myTextiles;
  }
}
