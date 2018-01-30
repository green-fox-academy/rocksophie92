package com.sophiecodes.dbpracticeapp1.repositories;

import com.sophiecodes.dbpracticeapp1.models.User;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserRepository extends CrudRepository<User, Integer> {
}
