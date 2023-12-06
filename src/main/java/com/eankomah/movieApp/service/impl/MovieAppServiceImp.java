package com.eankomah.movieApp.service.impl;

import com.eankomah.movieApp.entity.MovieInfo;
import com.eankomah.movieApp.repository.MovieAppRepository;
import com.eankomah.movieApp.service.MovieAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieAppServiceImp implements MovieAppService {

    private final MovieAppRepository movieAppRepository;
    @Override
    public MovieInfo saveMovie(MovieInfo movieInfo) {
        return movieAppRepository.save(movieInfo);
    }
}
