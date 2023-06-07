package com.Ajay.MovieClient;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MovieRepository {

    HashMap<String,Movie> map=new HashMap<>();


//    public void add(Movie movie) {
//        map.put(movie.getImdb_id(),movie);
//    }
}
