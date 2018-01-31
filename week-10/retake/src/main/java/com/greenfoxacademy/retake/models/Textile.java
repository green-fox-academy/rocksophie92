package com.greenfoxacademy.retake.models;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class Textile {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String itemName;
  private String manufacturer;
  private String category;
  private String size;
  private Float unitPrice;
  private Integer inStore;

  public Textile() {
  }

  public Textile(Integer id, String itemName, String manufacturer, String category, String size, Float unitPrice, Integer inStore) {
    this.id = id;
    this.itemName = itemName;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.unitPrice = unitPrice;
    this.inStore = inStore;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Integer getInStore() {
    return inStore;
  }

  public void setInStore(Integer inStore) {
    this.inStore = inStore;
  }
}
