package com.Ajay.MovieClient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieCollection {
    private int id;
    private String name;
    private String poster_path;
    private String backdrop_path;


}
