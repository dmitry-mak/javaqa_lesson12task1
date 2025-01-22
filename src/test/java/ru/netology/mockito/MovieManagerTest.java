package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {

    // Добавление новой позиции.
    @Test
    void testAddMovie() {
        MovieManager movieManager = new MovieManager();

        Movie movie1 = new Movie(1, "Mission impossible", 1995, "fantasy");
        Movie movie2 = new Movie(2, "Lord of the rigs", 2003, "history");
        movieManager.addMovie(movie1);

        Movie[] expected = {movie1};
        Assertions.assertArrayEquals(expected, movieManager.findAll());
        movieManager.addMovie(movie2);
        expected = new Movie[]{movie1, movie2};
        Assertions.assertArrayEquals(expected, movieManager.findAll());

    }
// Возвращает весь список фильмов
    @Test
    void findAll() {
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

        Assertions.assertArrayEquals(expected, movieManager.findAll());
    }

    //    Для объекта с конструктором по умолчанию.
    //    Должен возвращать 5 последних добавленных позиций в обратном порядке
    @Test
    void getLastMoviesWithDefaultConstructor() {
        MovieManager movieManager = new MovieManager();

        Movie movie1 = new Movie(1, "Mission impossible", 1995, "fantasy");
        Movie movie2 = new Movie(2, "Lord of the rigs", 2003, "history");
        Movie movie3 = new Movie(3, "Blowup", 1966, "history");
        Movie movie4 = new Movie(4, "The Silence of the Lambs", 1991, "educational");
        Movie movie5 = new Movie(5, "Matrix", 1999, "biography");
        Movie movie6 = new Movie(6, "Star Wars", 1978, "religious");
        Movie movie7 = new Movie(7, "The Silence of the Lambs", 1991, "educational");

        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);
        movieManager.addMovie(movie4);
        movieManager.addMovie(movie5);
        movieManager.addMovie(movie6);
        movieManager.addMovie(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, movieManager.getLastMovies());
    }

    //    Для объекта с конструктором по умолчанию.
    //    Длина массива длиной меньше 5. Метод должен возвращать весь список в обратном порядке
    @Test
    void getLastMoviesWithDefaultConstructor_ArrayOverLimit() {
        MovieManager movieManager = new MovieManager();


        Movie movie4 = new Movie(4, "The Silence of the Lambs", 1991, "educational");
        Movie movie5 = new Movie(5, "Matrix", 1999, "biography");
        Movie movie6 = new Movie(6, "Star Wars", 1978, "religious");
        Movie movie7 = new Movie(7, "The Silence of the Lambs", 1991, "educational");

        movieManager.addMovie(movie4);
        movieManager.addMovie(movie5);
        movieManager.addMovie(movie6);
        movieManager.addMovie(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4};

        Assertions.assertArrayEquals(expected, movieManager.getLastMovies());
    }

    //    Для объекта с перегруженным конструктором.
    //    Должен передавать последние добавленные позиции, количество которых передается через конструктор, в обратном порядке
    @Test
    void getLastMoviesWithLimit() {
        MovieManager movieManager = new MovieManager(3);

        Movie movie1 = new Movie(1, "Mission impossible", 1995, "fantasy");
        Movie movie2 = new Movie(2, "Lord of the rigs", 2003, "history");
        Movie movie3 = new Movie(3, "Blowup", 1966, "history");
        Movie movie4 = new Movie(4, "The Silence of the Lambs", 1991, "educational");
        Movie movie5 = new Movie(5, "Matrix", 1999, "biography");
        Movie movie6 = new Movie(6, "Star Wars", 1978, "religious");

        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);
        movieManager.addMovie(movie4);
        movieManager.addMovie(movie5);
        movieManager.addMovie(movie6);

        Movie[] expected = {movie6, movie5, movie4};

        Assertions.assertArrayEquals(expected, movieManager.getLastMovies());
    }

    //    Для объекта с перегруженным конструктором.
    //    Длина массива меньше установленного лимита
    //    Должен возвращать массив целиком
    @Test
    void getLastMoviesWithLimit_OverLimit() {
        MovieManager movieManager = new MovieManager(7);

        Movie movie1 = new Movie(1, "Mission impossible", 1995, "fantasy");
        Movie movie2 = new Movie(2, "Lord of the rigs", 2003, "history");
        Movie movie3 = new Movie(3, "Blowup", 1966, "history");
        Movie movie4 = new Movie(4, "The Silence of the Lambs", 1991, "educational");
        Movie movie5 = new Movie(5, "Matrix", 1999, "biography");
        Movie movie6 = new Movie(6, "Star Wars", 1978, "religious");

        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);
        movieManager.addMovie(movie4);
        movieManager.addMovie(movie5);
        movieManager.addMovie(movie6);

        Movie[] expected = {movie6, movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, movieManager.getLastMovies());
    }


}