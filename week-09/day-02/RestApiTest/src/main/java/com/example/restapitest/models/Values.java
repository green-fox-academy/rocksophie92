package com.example.restapitest.models;

public class Values {

  private int received;
  private int result;

  public Values(int received) {
    this.received = received;
    this.result = received*2;
  }

  public Values() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
