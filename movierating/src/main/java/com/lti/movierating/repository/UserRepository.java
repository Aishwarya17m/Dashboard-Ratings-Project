package com.lti.movierating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.movierating.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}