package com.example.lista.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class OmdbResponse {
    
    @JsonProperty("Search")
    private List<MovieDTO> search;
    @JsonProperty("totalResults")
    private String totalResults;
    @JsonProperty("Response")
    private String response;
    

}
