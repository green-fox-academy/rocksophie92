package com.example.restapitest.models;

public class DoUntilSum {

  private int sumResult;

  public DoUntilSum() {
  }

  public DoUntilSum(int input) {
    for (int i = 0; i < input ; i++) {
      this.sumResult += input-1;
    }
  }

  public int getSumResult() {
    return sumResult;
  }

  public void setSumResult(int sumResult) {
    this.sumResult = sumResult;
  }
}