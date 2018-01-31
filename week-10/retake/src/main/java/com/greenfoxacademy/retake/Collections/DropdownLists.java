package com.greenfoxacademy.retake.Collections;

import com.greenfoxacademy.retake.services.TextileService;
import groovy.lang.Lazy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DropdownLists {

  @Autowired
  TextileService textileService;


  private List<String> sizes;

}
