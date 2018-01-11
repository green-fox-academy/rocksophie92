package com.greenfoxacademy.utilities.services;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Random;

@Service
public class ColorService {

  Color color;
  Random r = new Random();

  public Color setRandomColor(Color color) {
    this.color = Color.getHSBColor(r.nextFloat(), r.nextFloat(), r.nextFloat());
    return Color.getHSBColor(r.nextFloat(), r.nextFloat(), r.nextFloat());
  }
}
