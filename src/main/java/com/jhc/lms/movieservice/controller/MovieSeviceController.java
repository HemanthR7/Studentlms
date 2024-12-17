package com.jhc.lms.movieservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jhc.lms.movieservice.model.Movie;
import com.jhc.lms.movieservice.service.MovieService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/lms/movie")

public class MovieSeviceController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/add")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		Movie movie1=movieService.addMovie(movie);
		return ResponseEntity.ok(movie);
		}
	@GetMapping()
	public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }
	@DeleteMapping("/{movieId}")
	public ResponseEntity<?> deleteMoviesById(@PathVariable("movieId")Long id) {
         movieService.deleteMovieById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
	@PutMapping("/{updateid}")
	public ResponseEntity<Movie>updateMovie(@RequestBody Movie movie){
		Movie movie1=movieService.updateMovie(movie);
		return ResponseEntity.ok(movie1);
	}


}
