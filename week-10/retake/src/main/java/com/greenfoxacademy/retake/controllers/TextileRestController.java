package com.greenfoxacademy.retake.controllers;

import com.greenfoxacademy.retake.models.RestReturnMessage;
import com.greenfoxacademy.retake.services.TextileService;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextileRestController {

  @Autowired
  TextileService textileService;

  @GetMapping(value = "/warehouse/query")
  public ResponseEntity<RestReturnMessage> priceFilter(@RequestParam(value = "price") Float priceParam,
                                                       @RequestParam(value = "type") String typeParam) {
    RestReturnMessage restReturnMessage = new RestReturnMessage();
    if (priceParam != null && typeParam != null) {
      restReturnMessage.setResult("OK");
      if (typeParam.equals("greater")) {
        restReturnMessage.setClothes(textileService.findAllWithGreaterPrice(priceParam));
      } else if (typeParam.equals("lower")) {
        restReturnMessage.setClothes(textileService.findAllWithLowerPrice(priceParam));
      }
      return new ResponseEntity<>(restReturnMessage, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(restReturnMessage, HttpStatus.BAD_REQUEST);
    }
  }
}