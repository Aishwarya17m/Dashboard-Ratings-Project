package com.lti.movierating.services;

import com.lti.movierating.entity.Movie;

import java.util.List;

public interface AdminService {
	
	public Movie addMovie(Movie movie);
	
	public List<Movie> getAllMovies();
}
