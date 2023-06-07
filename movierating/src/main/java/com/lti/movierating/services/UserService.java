package com.lti.movierating.services;

import java.util.List;

import java.util.Optional;

import com.lti.movierating.entity.Movie;
import com.lti.movierating.entity.Ratings;



import com.lti.movierating.entity.User;

public interface UserService {

	public User addUser(User user);
	
	public Ratings addRatings(Ratings rating);
	
	public User getUserById(int id);


	boolean checkIfAlreadyExists(int userId, int movieId);



	public List<Ratings> getRatingsByUser(int userId);

	List<Ratings> getRatingsByMovie(int id);
	public float getMovieRating(int id);
	
	


}