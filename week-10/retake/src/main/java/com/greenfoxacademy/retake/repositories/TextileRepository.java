package com.greenfoxacademy.retake.repositories;

import com.greenfoxacademy.retake.models.Textile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextileRepository extends CrudRepository<Textile, Integer> {

  public Textile findTextileByItemName(String itemName);
}
