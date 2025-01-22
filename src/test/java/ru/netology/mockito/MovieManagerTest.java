package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {


    @Test
    void testAddMovie() {
        MovieManager movieManager = new MovieManager();

        Movie movie1 = new Movie(1, "Mission impossible", 1995, "fantasy");
        Movie movie2 = new Movie(2, "Lord of the rigs", 2003, "history");
        movieManager.addMovie(movie1);

        Movie[] expected = {movie1};
        Assertions.assertArrayEquals(expected, movieManager.finfAll());
        movieManager.addMovie(movie2);
        expected = new Movie[]{movie1, movie2};
        Assertions.assertArrayEquals(expected, movieManager.finfAll());

    }

    @Test
    void finfAll() {
        MovieManager movieManager = new MovieManager(2);

        Movie movie1 = new Movie(1, "Mission impossible", 1995, "fantasy");
        Movie movie2 = new Movie(2, "Lord of the rigs", 2003, "history");
        Movie movie3 = new Movie(3, "Blowup", 1966, "history");
        Movie movie4 = new Movie(4, "The Silence of the Lambs", 1991, "educational");

        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);
        movieManager.addMovie(movie4);

        Movie[] expected = {movie1, movie2, movie3, movie4};

        Assertions.assertArrayEquals(expected, movieManager.finfAll());
    }
}