package com.lti.movierating.services;


import java.util.List;
import java.util.Optional;

import com.lti.movierating.entity.Movie;

public interface MovieService {

	public Movie getMovieById(int id);

	
	public Optional<Movie> findMovieById(int id);
}

}

