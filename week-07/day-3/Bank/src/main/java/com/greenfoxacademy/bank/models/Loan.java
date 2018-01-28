package com.greenfoxacademy.bank.models;

public class Loan {

  private double loanAmount;
  private int durationInMonths;
  private String type;

  public Loan() {
  }

  public Loan(double loanAmount, int durationInMonths, String type) {
    this.loanAmount = loanAmount;
    this.durationInMonths = durationInMonths;
    this.type = type;
  }

  public double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  public int getDurationInMonths() {
    return durationInMonths;
  }

  public void setDurationInMonths(int durationInMonths) {
    this.durationInMonths = durationInMonths;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
