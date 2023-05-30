package com.lti.movierating.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.movierating.entity.Movie;
import com.lti.movierating.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepo;

	@Override
	public Optional<Movie> getMovieById(int id) {
		// TODO Auto-generated method stub
		return movieRepo.findById(id);
	}

	
}
