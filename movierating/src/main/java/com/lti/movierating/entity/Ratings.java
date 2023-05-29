package com.lti.movierating.entity;



import java.util.Optional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Ratings {

	@Id
	@GeneratedValue
	private int ratingsId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="movieId")
	private Optional<Movie> movie;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Optional<User> user;
	
	private float rating;

	public int getRatingsId() {
		return ratingsId;
	}

	public void setRatingsId(int ratingsId) {
		this.ratingsId = ratingsId;
	}

	public Optional<Movie> getMovie() {
		return movie;
	}

	public void setMovie(Optional<Movie> movie) {
		this.movie = movie;
	}

	public Optional<User> getUser() {
		return user;
	}

	public void setUser(Optional<User> user) {
		this.user = user;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Ratings() {
		
	}
	
	public Ratings(int ratingsId, Movie movie, User user, float rating) {
		super();
		this.ratingsId = ratingsId;
		this.movie = Optional.ofNullable(movie);
		this.user = Optional.ofNullable(user);
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Ratings [ratingsId=" + ratingsId + ", movie=" + movie + ", user=" + user + ", rating=" + rating + "]";
	}
	
	
	
	
	
}
