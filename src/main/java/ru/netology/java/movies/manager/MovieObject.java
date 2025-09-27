package ru.netology.java.movies.manager;

public class MovieObject {

    private String movieName;
    private String genre;
    private String director;
    private String countryOfOrigin;
    private int durationInMinutes;
    private String premiereDate;


    public MovieObject(String movieName, String genre, String director, String countryOfOrigin, int durationInMinutes, String premiereDate) {
        this.movieName = movieName;
        this.genre = genre;
        this.director = director;
        this.countryOfOrigin = countryOfOrigin;
        this.durationInMinutes = durationInMinutes;
        this.premiereDate = premiereDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(String premiereDate) {
        this.premiereDate = premiereDate;
    }
}
