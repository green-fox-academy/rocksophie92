package com.example.restapitest.models;

public class DoUntilFactor {

  private Integer factorResult;

  public DoUntilFactor() {
  }

  public DoUntilFactor(Integer input) {
    for (int i = 0; i < input ; i++) {
      this.factorResult *= input-1;
    }
  }

  public Integer getFactorResult() {
    return factorResult;
  }

  public void setFactorResult(Integer factorResult) {
    this.factorResult = factorResult;
  }
}
