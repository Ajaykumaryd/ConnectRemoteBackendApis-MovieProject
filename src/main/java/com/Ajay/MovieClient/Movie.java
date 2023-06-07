package com.Ajay.MovieClient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private Boolean adult;
    private String imdb_id;
    private String budget;
    private String original_language;
    private String original_title;
    private MovieCollection belongs_to_collection;
}




