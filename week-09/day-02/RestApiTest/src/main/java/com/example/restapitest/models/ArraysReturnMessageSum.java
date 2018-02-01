package com.example.restapitest.models;

public class ArraysReturnMessageSum extends ArraysResponse{

  private int result;

  public ArraysReturnMessageSum() {
  }

  public ArraysReturnMessageSum(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
