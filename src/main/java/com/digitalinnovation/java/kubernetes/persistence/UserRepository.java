package com.digitalinnovation.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.digitalinnovation.java.kubernetes.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

