package com.greenfoxacademy.retake.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  public Cart() {
  }


  public float countSubTotal(int quantity, float unitPrice) {
    return quantity*unitPrice;
  }

  public List<Textile> filLCart(Textile textile) {
    List<Textile> itemsInCart = new ArrayList<>();
    itemsInCart.add(textile);
    return itemsInCart;
  }
}
