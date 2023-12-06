package com.eankomah.movieApp.controller;
import com.eankomah.movieApp.entity.MovieInfo;
import com.eankomah.movieApp.service.MovieAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    private final MovieAppService movieAppService;
@GetMapping
    public ResponseEntity<String> sayHello(){
    return ResponseEntity.ok("Welcome Admin");
}


        @PostMapping("/saveMovie")
        public ResponseEntity<MovieInfo> saveMovie(@RequestBody MovieInfo movieInfo){
            return ResponseEntity.ok(movieAppService.saveMovie(movieInfo));

        }

//    http://localhost:8080/api/v1/admin/saveMovie
}
