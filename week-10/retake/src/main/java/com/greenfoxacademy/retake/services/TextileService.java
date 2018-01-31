package com.greenfoxacademy.retake.services;

import com.greenfoxacademy.retake.models.MyTextile;
import com.greenfoxacademy.retake.models.Textile;
import com.greenfoxacademy.retake.repositories.TextileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TextileService {

  @Autowired
  TextileRepository textileRepository;

  Textile textile;
  MyTextile myTextile;
  List<MyTextile> myTextiles;

  public List<Textile> findAll() {
    return (List<Textile>) textileRepository.findAll();
  }

  public Textile getTextileByName(String name) {
    return textileRepository.findTextileByItemName(name);
  }

  public HashMap<Integer, String> singleItemNameElements() {
    List<String> itemNames = new ArrayList<>();
  for (int i = 0; i <findAll().size(); i++) {
    itemNames.add(findAll().get(i).getItemName());
  }
  HashMap<Integer, String> uniqueItemNames = new HashMap<>();
  for (int i = 0; i <itemNames.size(); i++) {
    uniqueItemNames.put(i, itemNames.get(i));
  }
  return uniqueItemNames;
}

  public HashMap<Integer, String> singleSizeElements() {
    List<String> sizes = new ArrayList<>();
    for (int i = 0; i <findAll().size(); i++) {
      sizes.add(findAll().get(i).getSize());
    }
    HashMap<Integer, String> uniqueSizes = new HashMap<>();
    for (int i = 0; i <sizes.size(); i++) {
      uniqueSizes.put(i, sizes.get(i));
    }
    return uniqueSizes;
  }


  public List<MyTextile> myOrderedTextiles(Textile textile, String size, int quantity) {
    myTextiles = new ArrayList<>();
    myTextile = new MyTextile();

    myTextile.setItemName(textile.getItemName());
    myTextile.setUnitPrice(textile.getUnitPrice());
    myTextile.setCategory(textile.getCategory());
    myTextile.setManufacturer(textile.getManufacturer());
    myTextile.setQuantity(quantity);
    myTextile.setSize(size);
    myTextile.setSubTotalPrice(quantity*myTextile.getUnitPrice());

    myTextiles.add(myTextile);
    return myTextiles;
  }
}
