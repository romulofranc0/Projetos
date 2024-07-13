package com.example.lista.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lista.Service.OmdbService;
import com.example.lista.model.MovieDTO;
import com.example.lista.model.OmdbResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OmdbController {

    private final OmdbService service;

    @GetMapping("/movies")
    public OmdbResponse searchMovies(@RequestParam String title){
        List<MovieDTO> movies = service.searchMovies(title);
        OmdbResponse response = new OmdbResponse(); 
        response.setSearch(movies);

        return response;
        
    }
    
    @GetMapping("/movie")
    public MovieDTO gMovieDTO(@RequestParam String title){
        return service.getMovie(title);
    }

   

}
