package com.sophiecodes.dbpracticeapp1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chocolate {

  private String type;
  private int gramms;
}
