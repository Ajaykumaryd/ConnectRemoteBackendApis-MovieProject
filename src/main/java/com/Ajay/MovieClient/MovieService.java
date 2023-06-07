package com.Ajay.MovieClient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MovieService {

    MovieClient movieClient=new MovieClient();
    public Movie getMovieFromClient(Integer id) {
       return movieClient.getMovie(id);
    }

}

