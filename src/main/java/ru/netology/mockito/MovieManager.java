package ru.netology.mockito;

public class MovieManager {

    //    private String[] movies = new String[0];
    private Movie[] movies = new Movie[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    // добавление нового фильма в массив
    public void addMovie(Movie newMovie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = newMovie;
        movies = tmp;
    }

    //    выводит список всех фильмов
    public Movie[] finfAll() {

        return movies;
    }

    public Movie[] getLastMovies() {
        int resultLength = Math.min(movies.length, limit);
        Movie[] result = new Movie[resultLength];

        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }
}
