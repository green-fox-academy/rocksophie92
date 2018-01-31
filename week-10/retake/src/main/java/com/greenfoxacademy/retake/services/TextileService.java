package com.greenfoxacademy.retake.services;

import com.greenfoxacademy.retake.models.Textile;
import com.greenfoxacademy.retake.repositories.TextileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextileService {

  @Autowired
  TextileRepository textileRepository;

  public List<Textile> findAll() {
    return (List<Textile>) textileRepository.findAll();
  }

  public List<String> uniqueItemNames() {
    return textileRepository.getDistinctItemNames();
  }

  public List<String> uniqueSizes() {
    return textileRepository.getDistinctSizes();
  }

  public ArrayList<Textile> filterByItemNameAndSize(String itemName, String size) {
    return (ArrayList<Textile>) textileRepository.findDistinctByItemNameAndSize(itemName, size);
  }

  public List<Textile> findAllWithGreaterPrice(Float priceParam) {
    return textileRepository.findAllByUnitPriceGreaterThan(priceParam);
  }

  public List<Textile> findAllWithLowerPrice(Float priceParam) {
    return textileRepository.findAllByUnitPriceLessThan(priceParam);
  }
}
