package com.lti.movierating.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.movierating.entity.Movie;
import com.lti.movierating.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepo;

	@Override
	public Movie getMovieById(int id) {
		// TODO Auto-generated method stub
		
		return movieRepo.getReferenceById(id);
		
	}

	
}
