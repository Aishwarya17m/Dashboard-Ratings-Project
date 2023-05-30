package com.lti.movierating.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private int movieId;
	
	private String  movieName;
	
	private String language;
	
	private String category;
	
	private String releaseDate;
	
//	@OneToMany(mappedBy = "movie")
//	private List<Movie> movies;
	

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Movie() {
	
	}

	public Movie(int movieId, String movieName, String language, String category, String releaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.category = category;
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", category="
				+ category + ", releaseDate=" + releaseDate + "]";
	}
	
	
	
}