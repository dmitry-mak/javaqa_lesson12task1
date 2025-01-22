package ru.netology.mockito;

public class Movie {

    private int id;
    private String name;
    private int yearOfRelease;
    private String genre;

    public Movie(int id, String name, int yearOfRelease, String genre) {
        this.id = id;
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie: id=" + id + ", Name='" + name + "', Year Of Release=" + yearOfRelease + ", Genre='" + genre + "'";
        }
}
