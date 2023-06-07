package com.Ajay.MovieClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MovieClient {

    private static String url="https://api.themoviedb.org/3/movie/%s?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e";


    MovieRepository repository=new MovieRepository();
    RestTemplate template=new RestTemplate();
    public Movie getMovie(int id) {
    String url2=String.format(url,id); //replace percentage sign with Id

//  String url2="https://api.themoviedb.org/3/movie/"+id+"?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e"

    Movie movie= template.getForObject(url2,Movie.class);
//    repository.add(movie);  if you want to add in your database
    return movie;
    }


    private static String key="cd46fe13f1442cfa663d94a7d3ed7e5e";
    private static String postMovieUrl="https://api.themoviedb.org/3/movie?=api_key=%s";
    public String addMovie(Movie movie){
    String postUrl=String.format(postMovieUrl,key);
    HttpEntity entity=new HttpEntity(movie);
    ResponseEntity response= template.exchange(postUrl, HttpMethod.POST,entity,ResponseEntity.class); //API generally sends Response Entity
    if(response.getStatusCode().is2xxSuccessful()) {
        return "Movie added Sucessfully";
    }else {
            return "no movie added";
      }
    }

}



}
