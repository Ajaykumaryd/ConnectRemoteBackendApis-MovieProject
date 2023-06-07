package com.Ajay.MovieClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class MovieClient {

    private static String url="https://api.themoviedb.org/3/movie/%s?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e";
//https://api.themoviedb.org/3/movie/234?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e

    private String baseUrl="https://api.themoviedb.org/3";
    private String updateMoviepath="/update-movie";

    private String getMoviepath="/movie/%s";

    MovieRepository repository=new MovieRepository();
    RestTemplate template=new RestTemplate();
//    public Movie getMovie(int id) {
//    String url2=String.format(url,id); //replace percentage sign with Id
//
////  String url2="https://api.themoviedb.org/3/movie/"+id+"?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e"
//
//    Movie movie= template.getForObject(url2,Movie.class);
////    repository.add(movie);  if you want to add in your database
//    return movie;
//    }

//    by exchnge method
//      public Movie getMovie(int id){
//      String url2=String.format(url,id);
//      ResponseEntity<Movie> response=template.exchange(url2,HttpMethod.GET,HttpEntity.EMPTY,Movie.class);
//      return response.getBody();
//      }

    public Movie getMovie(Integer id){
        String url2=UriComponentsBuilder
                .fromHttpUrl(baseUrl)
                .path(String.format(getMoviepath,id))
                .queryParam("api_key",key)
                .build()
                .toUriString();
        ResponseEntity<Movie> response=template.exchange(url2,HttpMethod.GET,HttpEntity.EMPTY,Movie.class);
        return response.getBody();
    }


    private static String key="cd46fe13f1442cfa663d94a7d3ed7e5e";
    private static String postMovieUrl="https://api.themoviedb.org/3/movie?=api_key=%s";
    public String addMovie(Movie movie){
    String postUrl=String.format(postMovieUrl,key);
    HttpEntity entity=new HttpEntity(movie);
    ResponseEntity response= template.exchange(postUrl, HttpMethod.POST,entity,String.class); //API generally sends Response Entity
    if(response.getStatusCode().is2xxSuccessful()) {
        return "Movie added Sucessfully";
    }else {
            return "no movie added";
      }
    }

    //https://api.themoviedb.org/3/movie/%s?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e


//      public String updateMovie(Integer id,String updatedTitle){
//          UriComponentsBuilder.fromHttpUrl(baseUrl).
//                  path(updateMoviepath).q
//      }




















}




