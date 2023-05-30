package com.lti.movierating.services;

import java.util.Optional;

import com.lti.movierating.entity.Movie;

public interface MovieService {

	public Optional<Movie> getMovieById(int id);
}
