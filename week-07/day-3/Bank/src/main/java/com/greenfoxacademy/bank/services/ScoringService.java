package com.greenfoxacademy.bank.services;

import com.greenfoxacademy.bank.factories.LoanFactory;
import com.greenfoxacademy.bank.models.Loan;
import com.greenfoxacademy.bank.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ScoringService {

  private List<Loan> loans;
  private LoanFactory loanFactory;

  @Autowired
  public ScoringService(LoanFactory loanFactory) {
    this.loanFactory = loanFactory;
  }

  public void provideLoan(User user) {
    if (user.getSalary() > user.getSpendings() + user.getRequestedLoanAmount() / user.getDurationInMonths()) {
      loans.add(calculateLoan(user));
    }
  }

  private Loan calculateLoan(User user) {
    Loan loan = loanFactory.getNewLoan();
    loan.setLoanAmount(user.getRequestedLoanAmount());
    loan.setDurationInMonths(user.getDurationInMonths());
    loan.setType(user.getRequestedLoanType());
    return loan;
  }
}