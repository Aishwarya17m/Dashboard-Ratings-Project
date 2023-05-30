package com.lti.movierating.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.movierating.entity.Movie;
import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;
import com.lti.movierating.repository.MovieRepository;
import com.lti.movierating.repository.RatingsRepository;
import com.lti.movierating.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
//	@Autowired
//	private AdminRepository adminRepo;
	
	@Autowired
	private MovieRepository movieRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RatingsRepository ratingsRepo;

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

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public List<Ratings> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingsRepo.findAll();
	}
	
	

}
