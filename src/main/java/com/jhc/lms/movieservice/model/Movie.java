package com.jhc.lms.movieservice.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_movie")
	@GenericGenerator(name="seq_movie",strategy="increment")
	@Column(name="id")
	private Long id;
	@Column(name="movie_name")
	private String name;
	@Column(name="movie_type")
	private String type;
	@Column(name="movie_duration")
	private String duration;
	@Column(name="hero_name")
	private String heroName;
	@Column(name="heroin_name")
	private String heroinName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroinName() {
		return heroinName;
	}
	public void setHeroinName(String heroinName) {
		this.heroinName = heroinName;
	}
	public Movie(Long id, String name, String type, String duration, String heroName, String heroinName) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.duration = duration;
		this.heroName = heroName;
		this.heroinName = heroinName;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", type=" + type + ", duration=" + duration + ", heroName="
				+ heroName + ", heroinName=" + heroinName + "]";
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}


}
