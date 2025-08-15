package com.pluralsight.choosing_right_collection.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MovieService {


    public List<String> getAvailableMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("Oppenheimer");
        movies.add("Jawan");
        movies.add("Barbie");
        Collections.sort(movies);
        return movies;
    }
}
