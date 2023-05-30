package com.lti.movierating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.movierating.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
