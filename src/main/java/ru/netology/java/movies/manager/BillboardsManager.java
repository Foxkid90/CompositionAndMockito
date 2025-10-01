package ru.netology.java.movies.manager;

public class BillboardsManager {
    private MovieObject[] films = new MovieObject[0];
    private int quantityOfLastMovies;


    public BillboardsManager(int quantityOfLastMovies) {
        this.quantityOfLastMovies = quantityOfLastMovies;
    }


    public BillboardsManager() {
        this.quantityOfLastMovies = 5;
    }


    public void addNewMovie(MovieObject film) {
        MovieObject[] tmp = new MovieObject[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }


    public MovieObject[] findAll() {
        return films;
    }


    public MovieObject[] findLast() {
        int resaltLength;
        if (films.length < quantityOfLastMovies) {
            resaltLength = films.length;
        } else {
            resaltLength = quantityOfLastMovies;
        }
        MovieObject[] last = new MovieObject[resaltLength];
        for (int i = 0; i < resaltLength; i++) {
            last[i] = films[films.length - 1 - i];
        }
        return last;
    }
}
