package com.jhc.lms.movieservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhc.lms.movieservice.model.Movie;
import com.jhc.lms.movieservice.repository.MovieServiceRepository;

@Service


public class MovieService {
	@Autowired
	private MovieServiceRepository movieServiceRepository;

	public Movie addMovie(Movie movie) {
		return movieServiceRepository.save(movie);
		
	}

	public List<Movie> getAllMovie() {
		
		  return movieServiceRepository.findAll(); 
		}

	public List<Movie> getAllMovies() {
		List<Movie>movies=(List<Movie>) movieServiceRepository.findAll();
		return movies;
	}
	

	public Movie updateMovie(Movie movie) {
		return movieServiceRepository.save(movie);
		
		
	}

	public void deleteMovieById(Long id) {
		 movieServiceRepository.deleteById(id);
		
		
	}


}
