package com.cg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
	@Id @GeneratedValue
private int reviewId;
private String reviewerName;
private String review;
private float ratings;

@ManyToOne
@JoinColumn(name="movieId")
private Movie movie;


public int getReviewId() {
	return reviewId;
}
public void setReviewId(int reviewId) {
	this.reviewId = reviewId;
}
public String getReviewerName() {
	return reviewerName;
}
public void setReviewerName(String reviewerName) {
	this.reviewerName = reviewerName;
}
public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}


}
