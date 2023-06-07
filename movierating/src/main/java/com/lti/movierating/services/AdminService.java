package com.lti.movierating.services;

import com.lti.movierating.entity.Admin;
import com.lti.movierating.entity.Movie;
import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;

import java.util.List;
import java.util.Optional;

public interface AdminService {
	
	public Movie addMovie(Movie movie);
	
	public List<Movie> getAllMovies();

	public Optional<Ratings> getRating(int mid);

	public List<Ratings> getAllRatings();

	public List<User> getAllUsers();

	public List<Admin> getAdmin();

	public Admin addAdmin(Admin admin);
}
