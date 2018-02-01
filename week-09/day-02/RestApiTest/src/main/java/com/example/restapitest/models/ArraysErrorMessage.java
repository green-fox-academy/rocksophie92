package com.example.restapitest.models;

public class ArraysErrorMessage extends ArraysResponse{

  private String error;

  public ArraysErrorMessage() {
  }

  public ArraysErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
