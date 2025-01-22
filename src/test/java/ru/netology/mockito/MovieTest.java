package ru.netology.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie(1, "Mission impossible", 1995, "fantasy");
    }

    @Test
    void getId() {
        int expected = 1;

        assertEquals(expected, movie.getId());
    }

    @Test
    void getName() {
        String expected = "Mission impossible";

        assertEquals(expected, movie.getName());
    }

    @Test
    void getYearOfRelease() {
        int expected = 1995;

        assertEquals(expected, movie.getYearOfRelease());
    }

    @Test
    void getGenre() {
        String expected = "fantasy";

        assertEquals(expected, movie.getGenre());
    }

}