package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.MovieDao;
import com.cg.model.Movie;

import jakarta.transaction.Transactional;
@Component
@Transactional
public class MovieServiceImpl implements MovieService{
    @Autowired
	private MovieDao movieDao;
	public Movie addNewMovieService(Movie m) {
		return movieDao.save(m);
	}
	public Movie searchMovieService(int movieCode) {
		//to search by PK
		return movieDao.findById(movieCode).orElseThrow(()-> new RuntimeException());
	}
	public List<Movie> allmoviesService() {
		return movieDao.findAll();
	}
	public List<Movie> searchByGenreService(String genre) {
		return movieDao.searchByGenre(genre);
	}
	public List<Movie> searchByLanguageService(String lang) {
		return movieDao.findByLanguage(lang);
	}
	public Movie updateMovieService(Movie m, int movieId) {
		movieDao.findById(movieId).orElseThrow(()-> new RuntimeException());
		return movieDao.save(m);
	}


	@Override
	public void deleteMovieService(int movieId) {
		// TODO Auto-generated method stub
		
	}

}
