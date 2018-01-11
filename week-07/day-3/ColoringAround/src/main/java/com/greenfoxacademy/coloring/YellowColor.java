package com.greenfoxacademy.coloring;

import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {
  @Override
  public String printColor(String color) {
    System.out.println(color);
    return color;
  }
}
