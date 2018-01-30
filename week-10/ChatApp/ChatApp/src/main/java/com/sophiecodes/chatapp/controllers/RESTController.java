package com.sophiecodes.chatapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

  @GetMapping(value = "/")
  public String showMainPage() {
    return "Peer to peer chat program";
  }


}
