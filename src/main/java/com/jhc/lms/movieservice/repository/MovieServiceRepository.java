package com.jhc.lms.movieservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhc.lms.movieservice.model.Movie;

@Repository
public interface MovieServiceRepository extends JpaRepository<Movie,Long>{

//	void deleteByName(String name);
	
}