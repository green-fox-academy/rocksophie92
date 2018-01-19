package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface HairdresserService {

  List<Hairdresser> hairdressers();

  Hairdresser getHairdresser (int id);

  Hairdresser findOne(String email);

  void create(Hairdresser hairdresser);

  void delete(int id);

  void register(Hairdresser hairdresser);

  void modifyUserData(Hairdresser hairdresser);

  boolean isAlreadyHairdresser(Hairdresser hairdresser);
}