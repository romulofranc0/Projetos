package com.example.lista.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lista.model.MovieDTO;
import com.example.lista.model.OmdbResponse;

@FeignClient(value = "omdbClient", url = "http://www.omdbapi.com/")
public interface OmdbClient {

    @GetMapping("/")
    OmdbResponse searchMovies(@RequestParam("s") String title, @RequestParam("apikey") String apiKey);
    
    @GetMapping("/")
    MovieDTO getMovie(@RequestParam("t") String title, @RequestParam("apikey") String apiKey);
}
