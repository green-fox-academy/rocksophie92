package com.greenfoxacademy.coloring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringApplication implements CommandLineRunner{

  @Autowired
  YellowColor yellowColor;

  @Autowired
  GreenColor greenColor;

  @Autowired
  Printer printer;

  public static void main(String[] args) {
    SpringApplication.run(ColoringApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    yellowColor.printColor("yellow");
    greenColor.printColor("green");
    printer.log(yellowColor.printColor("yellow"));
  }
}
