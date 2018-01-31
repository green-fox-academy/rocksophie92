package com.greenfoxacademy.retake.models;

public class MyTextile {

  private String itemName;
  private String manufacturer;
  private String category;
  private String size;
  private Integer quantity;
  private Float unitPrice;
  private Float subTotalPrice;

  public MyTextile() {
  }

  public MyTextile(String itemName, String manufacturer, String category, String size, Integer quantity, Float unitPrice, Float subTotalPrice) {
    this.itemName = itemName;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.subTotalPrice = subTotalPrice;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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

  public Float getSubTotalPrice() {
    return subTotalPrice;
  }

  public void setSubTotalPrice(Float subTotalPrice) {
    this.subTotalPrice = subTotalPrice;
  }
}
