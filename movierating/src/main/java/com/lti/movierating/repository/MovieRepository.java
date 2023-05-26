package com.lti.movierating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.movierating.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	
}
