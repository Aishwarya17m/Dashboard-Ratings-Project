package com.lti.movierating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.movierating.entity.Admin;
import com.lti.movierating.entity.Movie;
import com.lti.movierating.entity.Ratings;
import com.lti.movierating.entity.User;
import com.lti.movierating.services.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/addMovie")
	public String addMovie(@RequestBody Movie movie) {
		adminService.addMovie(movie);
		return "Movie added";
	}
	
	@GetMapping("/getallmovies")
	public List<Movie> getAllMovies(){
		return adminService.getAllMovies();
	}
	
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers(){
		return adminService.getAllUsers();
	}
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin(){
		return adminService.getAdmin();
	}
	
	@GetMapping("/getallratings")
	public List<Ratings> getAllRatings(){
		return adminService.getAllRatings();
	}
}
