package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ThMovieControllerImpl implements ThMovieController {

    MovieService movieService;

    public ThMovieControllerImpl(MovieService movieService){
        this.movieService = movieService;
    }

    @Override
    @GetMapping(value={"/contact"})
    public String contactInfo(){
        return "contact";
    }

}
