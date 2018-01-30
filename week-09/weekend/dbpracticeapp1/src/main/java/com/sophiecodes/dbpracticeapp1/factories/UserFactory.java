package com.sophiecodes.dbpracticeapp1.factories;

import com.sophiecodes.dbpracticeapp1.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

  private User user;

  public User getUser() {
    this.user = new User();
    return user;
  }


}
