package com.example.lista.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDTO {
    
    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year")
    private String year;


    @JsonProperty("imdbID")
    private String imdbId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Poster")
    private String poster;

}
