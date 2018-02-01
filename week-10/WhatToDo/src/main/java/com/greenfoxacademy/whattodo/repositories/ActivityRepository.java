package com.greenfoxacademy.whattodo.repositories;

import com.greenfoxacademy.whattodo.models.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Integer>{
}
