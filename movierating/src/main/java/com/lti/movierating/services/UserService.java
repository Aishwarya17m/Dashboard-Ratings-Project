package com.lti.movierating.services;

import java.util.Optional;

import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;

public interface UserService {

	public User addUser(User user);
	
	public Ratings addRatings(Ratings rating);
	
	public Optional<User> getUserById(int id);
	
}