package com.lti.movierating.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.movierating.entity.Movie;
import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;
import com.lti.movierating.services.AdminService;
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

	@Autowired
	private AdminService adminService;
//	private Movie
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "User added";
	}
	
	@GetMapping("/getMovie/{movieId}")
	public Optional<Movie> getMovie(@PathVariable("movieId") int movieId) {
		Optional<Movie> m= movieService.findMovieById(movieId);
		return m;
	}
	@GetMapping("/getMovies")
	public List<Movie> getMovie() {
		return  adminService.getAllMovies();
		
	}
	@GetMapping("/getRating/{movieId}")
	public Optional<Ratings> getRating(@PathVariable("movieId") int movieId) {
		return  adminService.getRating(movieId);
		
	}
	@PostMapping("/rateMovie/{userId}/{movieId}")
	public String rateMovie( @RequestBody Ratings rating, @PathVariable("userId") int userId, @PathVariable("movieId") int movieId) {
		
		
		if(userService.checkIfAlreadyExists(userId,movieId)==false) {
		
			rating.setUser(userService.getUserById(userId));
			rating.setMovie(movieService.getMovieById(movieId));
		
		
			userService.addRatings(rating);
			return "Rating added";
		}
		
		return "Rating already exists from this user for this movie";
	}
		
	
	
	
	
}