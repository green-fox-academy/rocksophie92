package com.greenfoxacademy.retake.models;

import com.greenfoxacademy.retake.services.TextileService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RestReturnMessage {

  @Autowired
  TextileService textileService;

  private String result;
  private List<Textile> clothes;

  public RestReturnMessage() {
  }

  public RestReturnMessage(String result, List<Textile> clothes) {
    this.result = result;
    this.clothes = clothes;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Textile> getClothes() {
    return clothes;
  }

  public void setClothes(List<Textile> clothes) {
    this.clothes = clothes;
  }
}
