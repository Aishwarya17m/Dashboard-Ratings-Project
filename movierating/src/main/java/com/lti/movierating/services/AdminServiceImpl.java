package com.lti.movierating.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.movierating.entity.Movie;
import com.lti.movierating.repository.AdminRepository;
import com.lti.movierating.repository.MovieRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private MovieRepository movieRepo;

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepo.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}
	
	

}
