package com.lti.movierating.entity;



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
	

	@ManyToOne(cascade = CascadeType.ALL,targetEntity = Movie.class)
	@JoinColumn(name="movieId", nullable = false)
	private Movie movie;
	

	@ManyToOne(cascade = CascadeType.ALL,targetEntity = User.class)
	@JoinColumn(name = "userId",nullable = false)
	private User user;
	
	private float rating;

	public int getRatingsId() {
		return ratingsId;
	}

	public void setRatingsId(int ratingsId) {
		this.ratingsId = ratingsId;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie =movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
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
		this.movie = movie;
		this.user = user;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Ratings [ratingsId=" + ratingsId + ", movie=" + movie + ", user=" + user + ", rating=" + rating + "]";
	}	
}

