package com.greenfoxacademy.springdbdemo.services;

import com.greenfoxacademy.springdbdemo.models.Hairdresser;
import com.greenfoxacademy.springdbdemo.repositories.HairdresserRepository;

import java.util.ArrayList;
import java.util.List;

public class HairdresserServiceImpl implements HairdresserService {

  private HairdresserRepository hairdresserRepository;

  public HairdresserServiceImpl(HairdresserRepository hairdresserRepository) {
    this.hairdresserRepository = hairdresserRepository;
  }

  @Override
  public List<Hairdresser> hairdressers() {
    List<Hairdresser> hairdressers = new ArrayList<>();
    hairdresserRepository.findAll().forEach(hairdressers::add);
    return hairdressers;
  }

  @Override
  public Hairdresser getHairdresser(int id) {
    return hairdresserRepository.findOne(id);
  }

  @Override
  public Hairdresser findOne(String email) {
    return hairdresserRepository.findByEmail(email);
  }

  @Override
  public void create(Hairdresser hairdresser) {
    hairdresserRepository.save(hairdresser);
  }

  @Override
  public void delete(int id) {
    hairdresserRepository.delete(id);
  }

  @Override
  public void register(Hairdresser hairdresser) {
    hairdresserRepository.save(hairdresser);
  }

  @Override
  public void modifyUserData(Hairdresser hairdresser) {
    hairdresserRepository.save(hairdresser);
  }

  @Override
  public boolean isAlreadyHairdresser(Hairdresser hairdresser) {
    return hairdressers().contains(hairdresser);
  }
}
