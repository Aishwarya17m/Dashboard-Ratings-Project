package com.lti.movierating.services;

import java.util.List;

import com.lti.movierating.entity.Movie;
import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;

public interface AdminService {
	
	public Movie addMovie(Movie movie);
	
	public List<Movie> getAllMovies();
	
	public List<User> getAllUsers();
	
	public List<Ratings> getAllRatings();
}
