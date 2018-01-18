package com.greenfoxacademy.springdbdemo.collections;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class HairdresserProperties {

  private List<String> hairdresserLevelList = new ArrayList<>(Arrays.asList("top", "lead", "owner"));

  private List<Integer> workingHours = new ArrayList<>(Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

  public HairdresserProperties() {
  }

  public List<String> getHairdresserLevelList() {
    return hairdresserLevelList;
  }

  public void setHairdresserLevelList(List<String> hairdresserLevelList) {
    this.hairdresserLevelList = hairdresserLevelList;
  }

  public List<Integer> getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(List<Integer> workingHours) {
    this.workingHours = workingHours;
  }
}
