package com.greenfoxacademy.netbank.controllers;

import com.greenfoxacademy.netbank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

  List<BankAccount> accountsList;
  BankAccount bankAccount;

  public List loadListWithDummyElements() {

    accountsList = new ArrayList<>();
    accountsList.add(new BankAccount("Nala", 3000, "lion"));
    accountsList.add(new BankAccount("Zazu", 300, "bird"));
    accountsList.add(new BankAccount("Flamingo", 3050, "flamingo"));
    return accountsList;
  }

  @ExceptionHandler(Exception.class)
  public String handleException(final Exception e) {
    return "forward:/serverError";
  }


  @RequestMapping(value = "/show_account_details", method = RequestMethod.GET)
  public String showBankAccountDetails(Model model) {
    bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", String.valueOf(bankAccount.getBalance()));
    model.addAttribute("animal", bankAccount.getAnimalType());
    System.out.println("working well");
    return "show_account_details";
  }

  @RequestMapping(value = "/list_accounts", method = RequestMethod.GET)
  public String listBankAccounts(Model model) {
    model.addAttribute("accounts", loadListWithDummyElements());
    System.out.println("working well");
    return "list_accounts";
  }
}
