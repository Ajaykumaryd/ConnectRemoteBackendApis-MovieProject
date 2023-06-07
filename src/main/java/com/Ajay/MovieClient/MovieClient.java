package com.Ajay.MovieClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class MovieClient {

    String url="https://api.themoviedb.org/3/movie/%s?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e";


    MovieRepository repository=new MovieRepository();
    RestTemplate template=new RestTemplate();
    public Movie getMovie(int id) {
    String url2=String.format(url,id); //replace percentage sign with Id
//  String url2="https://api.themoviedb.org/3/movie/"+id+"?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e"
    Movie movie= template.getForObject(url2,Movie.class);
//    repository.add(movie);
    return movie;
    }
}
