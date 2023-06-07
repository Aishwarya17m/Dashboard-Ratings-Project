package com.lti.movierating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, Integer>{
//	public Ratings findByUser(User  userId);
}