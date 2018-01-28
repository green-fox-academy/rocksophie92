package com.greenfoxacademy.bank.models;

import java.util.List;

public class User {

  private String name;
  private double salary;
  private double spendings;
  private double requestedLoanAmount;
  private int durationInMonths;
  private String requestedLoanType;
  private List<Loan> loans;

  public User() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSpendings() {
    return spendings;
  }

  public void setSpendings(double spendings) {
    this.spendings = spendings;
  }

  public double getRequestedLoanAmount() {
    return requestedLoanAmount;
  }

  public void setRequestedLoanAmount(double requestedLoanAmount) {
    this.requestedLoanAmount = requestedLoanAmount;
  }

  public int getDurationInMonths() {
    return durationInMonths;
  }

  public void setDurationInMonths(int durationInMonths) {
    this.durationInMonths = durationInMonths;
  }

  public String getRequestedLoanType() {
    return requestedLoanType;
  }

  public void setRequestedLoanType(String requestedLoanType) {
    this.requestedLoanType = requestedLoanType;
  }

  public List<Loan> getLoans() {
    return loans;
  }

  public void setLoans(List<Loan> loans) {
    this.loans = loans;
  }

  public void addLoan(Loan loan) {
    loans.add(loan);
  }

  @Override
  public boolean equals(Object obj) {
    User otherUser = (User) obj;
    return this.name.equals(otherUser.getName());
  }
}
