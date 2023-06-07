package com.Ajay.MovieClient;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

    MovieClient movieClient=new MovieClient();
    public Movie getMovieFromClient(int id) {
       return movieClient.getMovie(id);
    }

}
