package com.smartmobion.feelhungry.models;

import java.util.ArrayList;

public class Movie {
	private String title, thumbnailUrl;
	private int year;
	private double rating;

	public String getTimig() {
		return timig;
	}

	public void setTimig(String timig) {
		this.timig = timig;
	}

	private String timig;

	private ArrayList<String> genre;

	public Movie() {
	}

	/*public Movie(String name, String thumbnailUrl, int year, double rating,
			ArrayList<String> genre) {
		this.title = name;
		this.thumbnailUrl = thumbnailUrl;
		this.year = year;
		this.rating = rating;
		this.genre = genre;
	}*/
	public Movie(String name, String thumbnailUrl, String timing, double rating,
				 ArrayList<String> genre) {
		this.title = name;
		this.thumbnailUrl = thumbnailUrl;
		this.timig = timing;
		this.rating = rating;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<String> getGenre() {
		return genre;
	}

	public void setGenre(ArrayList<String> genre) {
		this.genre = genre;
	}

}
