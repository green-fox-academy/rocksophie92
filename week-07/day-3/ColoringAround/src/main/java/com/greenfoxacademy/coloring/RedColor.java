package com.greenfoxacademy.coloring;

public class RedColor implements MyColor {
  @Override
  public String printColor(String color) {
    System.out.println(color);
    return color;
  }
}
