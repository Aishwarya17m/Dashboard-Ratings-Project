package com.lti.movierating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.movierating.entity.Movie;
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
	
	@GetMapping("/getall")
	public List<Movie> getAllDetails(){
		return adminService.getAllMovies();
	}
}
