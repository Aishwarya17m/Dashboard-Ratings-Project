package com.lti.movierating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.movierating.entity.Ratings;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, Integer>{

}