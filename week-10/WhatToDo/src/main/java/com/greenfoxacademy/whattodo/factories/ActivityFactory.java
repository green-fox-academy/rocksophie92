package com.greenfoxacademy.whattodo.factories;

import com.greenfoxacademy.whattodo.models.Activity;
import com.greenfoxacademy.whattodo.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ActivityFactory {

  @Autowired
  ActivityRepository activityRepository;

  Random r;

  public ActivityFactory() {
    this.r = new Random();
  }

  public List<Activity> activityList() {
    return (List<Activity>) activityRepository.findAll();
  }

  public Activity getActivity() {
    Activity activity = new Activity();
    return activity;
  }

  public Activity getRandomActivity() {
    return activityList().get(r.nextInt(activityList().size()));
  }
}
