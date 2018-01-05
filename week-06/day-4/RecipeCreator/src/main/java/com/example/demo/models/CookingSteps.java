package com.example.demo.models;

public enum CookingSteps {

  MIX_INGREDIENTS("Mix the following ingredients: %s."),
  PREHEAT_OVEN("Preheat the oven to %d degrees."),
  STEAM_INGREDIENTS("Steam %s until soft."),
  CUT_INGREDIENTS("Cut the following ingredients to desired size and shape: %s"),
  DRAIN_INGREDIENTS("Drain %s."),
  SEASON("Season your dish with %s."),
  COOK_INGREDIENTS("Cook %s until soft."),
  BAKE_INGREDIENTS("Bake %s."),
  GRATE_INGREDIENTS("Grate %s."),
  SOAK_INGREDIENTS("Soak %s in water for 2-3 hours or overnight."),
  WASH_INGREDIENTS("Thoroughly wash %s."),
  SPRINKLE_INGREDIENTS("Sprinkle %s over your dish."),;

  private String cookingStepDescription;

  CookingSteps(String cookingStepDescription) {
    this.cookingStepDescription = cookingStepDescription;
  }
}
