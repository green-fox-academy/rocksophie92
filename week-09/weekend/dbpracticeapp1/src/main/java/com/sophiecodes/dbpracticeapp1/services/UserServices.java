package com.sophiecodes.dbpracticeapp1.services;

import com.sophiecodes.dbpracticeapp1.factories.UserFactory;
import com.sophiecodes.dbpracticeapp1.models.Chocolate;
import com.sophiecodes.dbpracticeapp1.models.User;
import com.sophiecodes.dbpracticeapp1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

  private List<Chocolate> chocolates;

  @Autowired
  UserFactory userFactory;
  @Autowired
  UserRepository userRepository;

  public List addChocolate(Chocolate chocolate) {
    chocolates.add(chocolate);
    return chocolates;
  }

  public void addUser(User user) {
    userRepository.save(user);
  }
}
