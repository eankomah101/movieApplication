package com.eankomah.movieApp.repository;

import com.eankomah.movieApp.entity.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieAppRepository extends JpaRepository<MovieInfo,Integer> {

}
