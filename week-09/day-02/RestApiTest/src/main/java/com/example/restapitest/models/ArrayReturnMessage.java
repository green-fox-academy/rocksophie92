package com.example.restapitest.models;

public class ArrayReturnMessage extends ArraysResponse{

  private int[] result;

  public ArrayReturnMessage() {
  }

  public ArrayReturnMessage(int[] result) {
    this.result = result;
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }
}
