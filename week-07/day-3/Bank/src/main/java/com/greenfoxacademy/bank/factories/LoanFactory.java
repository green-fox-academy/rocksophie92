package com.greenfoxacademy.bank.factories;

import com.greenfoxacademy.bank.models.Loan;
import org.springframework.stereotype.Component;

@Component
public class LoanFactory {

  public LoanFactory() {
  }

  public Loan getNewLoan() {
    return getLoan();
  }

  private Loan getLoan() {
    Loan loan = new Loan();
    return loan;
  }
}
