package com.greenfoxacademy.springdbdemo.factories;

import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import org.springframework.stereotype.Component;

@Component
public class HairdresserFactory {

  public Hairdresser getHairdresser() {
    Hairdresser hairdresser = new Hairdresser();
    return hairdresser;
  }
}
