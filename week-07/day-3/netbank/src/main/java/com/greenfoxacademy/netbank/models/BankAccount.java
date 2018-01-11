package com.greenfoxacademy.netbank.models;

public class BankAccount {

  private String name;
  private String balance;
  private String animalType;

  StringBuilder stringBuilder = new StringBuilder();

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = stringBuilder.append(balance + "0 $").toString();
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}