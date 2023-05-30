package com.lti.movierating.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;
import com.lti.movierating.repository.RatingsRepository;
import com.lti.movierating.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RatingsRepository ratingsRepo;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public Ratings addRatings(Ratings rating) {
		// TODO Auto-generated method stub
		return ratingsRepo.save(rating);
	}

	@Override
	public Optional<User> getUserById(int id) {
		return userRepo.findById(id);
	}
	
}
