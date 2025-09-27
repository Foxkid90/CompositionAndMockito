package ru.netology.java.movies.manager;

public class BillboardsManager {
    private MovieObject[] films = new MovieObject[0];
    private int quantityOfLastMovies;

    public BillboardsManager(int quantityOfLastMovies) {

//        if (quantityOfLastMovies > films.length) {
//            return;
//        }
//        if (quantityOfLastMovies < 0) {
//            return;
//        }
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
        films = tmp;
    }

    public MovieObject[] findAll() {
        return films;
    }

    public MovieObject[] findLast() {
        if (quantityOfLastMovies > films.length) {
            quantityOfLastMovies = films.length;
        }
        if (quantityOfLastMovies < 0) {
            quantityOfLastMovies = 0;
        }
        MovieObject[] last = new MovieObject[quantityOfLastMovies];
        for (int i = 0; i < quantityOfLastMovies; i++) {
            last[i] = films[films.length - 1 - i];
        }
        return last;

    }
}
