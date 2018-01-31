package com.greenfoxacademy.retake.repositories;

import com.greenfoxacademy.retake.models.Textile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextileRepository extends CrudRepository<Textile, Integer> {

  List<Textile> findDistinctByItemNameAndSize(String itemName, String size);

  @Query(value = "SELECT DISTINCT item_name FROM warehouse", nativeQuery = true)
  List<String> getDistinctItemNames();

  @Query(value = "SELECT DISTINCT size FROM warehouse", nativeQuery = true)
  List<String> getDistinctSizes();

  List<Textile> findAllByUnitPriceGreaterThan(Float priceParam);

  List<Textile> findAllByUnitPriceLessThan(Float priceParam);
}
