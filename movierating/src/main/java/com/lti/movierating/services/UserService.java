package com.lti.movierating.services;

import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;

public interface UserService {

	public User addUser(User user);
	
	public Ratings addRatings(Ratings rating);
	
	public User getUserById(int id);
	
}