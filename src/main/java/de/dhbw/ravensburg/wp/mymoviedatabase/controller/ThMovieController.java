package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface ThMovieController {
    @GetMapping(value={"/contact"})
    String contactInfo();
}
