package com.greenfoxacademy.bank.controllers;

import com.greenfoxacademy.bank.factories.LoanFactory;
import com.greenfoxacademy.bank.models.Loan;
import com.greenfoxacademy.bank.models.User;
import com.greenfoxacademy.bank.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScoringController {

  UserService userService;
  LoanFactory loanFactory;

  @Autowired
  public ScoringController(UserService userService, LoanFactory loanFactory) {
    this.userService = userService;
    this.loanFactory = loanFactory;
  }

  @GetMapping("/users/{userName}/scoring")
  public String showScoringPage(Model model, @PathVariable String userName) {
    model.addAttribute("loan", loanFactory.getNewLoan());
    model.addAttribute("user", userService.findUser(userName));
    return "scoring";
  }

  @PostMapping("/users/{userName}/user_profile")
  public ModelAndView submitScoring(Model model, @ModelAttribute User userFormData, @ModelAttribute Loan loan, @PathVariable String userName) {
    User user = userService.findUser(userFormData.getName());
    user.addLoan(loan);
    model.addAttribute("user", user);
    return new ModelAndView("redirect:/users/" + user.getName());
  }
}
