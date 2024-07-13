package com.example.lista.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.lista.client.OmdbClient;
import com.example.lista.model.MovieDTO;
import com.example.lista.model.OmdbResponse;

@Service

public class OmdbService {

    private static final Logger log = LoggerFactory.getLogger(OmdbService.class);
    private final OmdbClient omdbClient;
    private final String apiKey;

    public OmdbService(OmdbClient omdbClient, @org.springframework.beans.factory.annotation.Value("${omdb.api.key}") String apiKey) {
        this.omdbClient = omdbClient;
        this.apiKey = apiKey;
    }

    public List<MovieDTO> searchMovies(String title) {
        OmdbResponse response = omdbClient.searchMovies(title, apiKey);
        log.info("OMDb API Response: {}", response);
        return response.getSearch();
    }

    public MovieDTO getMovie(String title) {
        return omdbClient.getMovie(title, apiKey);
    }
}
