package com.lti.movierating.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;
import com.lti.movierating.services.MovieService;
import com.lti.movierating.services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MovieService movieService;

	
//	private Movie
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "User added";
	}
	
	@PostMapping("/rateMovie/{userId}/{movieId}")
	public String rateMovie( @RequestBody Ratings rating,@PathVariable("movieId") int movieId, @PathVariable("userId") int userId) {
		rating.setUser(userService.getUserById(userId));
		rating.setMovie(movieService.getMovieById(movieId));
		userService.addRatings(rating);
	
		return "added";
		
		
	}
	
}