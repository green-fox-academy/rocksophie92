package com.greenfoxacademy.springdbdemo.collections;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class HairdresserLevels {

  List<String> hairdresserLevelList = new ArrayList<>(Arrays.asList("top", "lead", "owner"));

  public HairdresserLevels() {
  }

  public List<String> getHairdresserLevelList() {
    return hairdresserLevelList;
  }

  public void setHairdresserLevelList(List<String> hairdresserLevelList) {
    this.hairdresserLevelList = hairdresserLevelList;
  }
}
