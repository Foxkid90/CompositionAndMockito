package ru.netology.java.movies.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardsManagerTest {

    MovieObject film1 = new MovieObject("Бладшот", "Боевик", "Дэйв Уилсон", "США", 109, "12 марта");
    MovieObject film2 = new MovieObject("Вперёд", "Мультфильм", "Дэн Скэнлон", "США", 102, "5 марта");
    MovieObject film3 = new MovieObject("Отель Белград", "Комедия", "Константин Статский", "Россия", 107, "5 марта");
    MovieObject film4 = new MovieObject("Джентельмены", "Криминальная комедия", "Гай Ричи", "США", 113, "13 февраля");
    MovieObject film5 = new MovieObject("Человек-невидимка", "Триллер", "Ли Уоннел", "США", 124, "5 марта");
    MovieObject film6 = new MovieObject("Тролли. Мировой тур", "Мультфильм", "Уолт Дорн", "США", 91, "19 марта");
    MovieObject film7 = new MovieObject("Номер один", "Комедия", "Михаил Расходников", "Россия", 92, "19 марта");


    @Test
    public void shouldAddNewMovieToTheBillboard() {
        BillboardsManager manager = new BillboardsManager();

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film6);
        manager.addNewMovie(film4);

        MovieObject[] expected = {film1, film2, film6, film4};
        MovieObject[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldOutputLastMoviesWithoutQuantityAddedFour() { // Эквивалентные группы / Граничные значения: 4
        BillboardsManager manager = new BillboardsManager();

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);

        MovieObject[] expected = {film4, film3, film2, film1};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldOutputLastMoviesWithoutQuantityAddedFive() { // Эквивалентные группы / Граничные значения: 5
        BillboardsManager manager = new BillboardsManager();

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);

        MovieObject[] expected = {film5, film4, film3, film2, film1};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldOutputLastMoviesWithoutQuantityAddedSix() { // Эквивалентные группы / Граничные значения: 6
        BillboardsManager manager = new BillboardsManager();

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);

        MovieObject[] expected = {film6, film5, film4, film3, film2};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldOutputLastMoviesWithoutQuantityNotAdded() { // Эквивалентные группы
        BillboardsManager manager = new BillboardsManager();

        MovieObject[] expected = {};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldOutputLastMoviesBoundaryValueSix() {
        BillboardsManager manager = new BillboardsManager(6); // Эквивалентные группы / Граничные значения: 6

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);
        manager.addNewMovie(film7);

        MovieObject[] expected = {film7, film6, film5, film4, film3, film2};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldOutputLastMoviesBoundaryValueSeven() {
        BillboardsManager manager = new BillboardsManager(7); // Эквивалентные группы / Граничные значения: 7

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);
        manager.addNewMovie(film7);

        MovieObject[] expected = {film7, film6, film5, film4, film3, film2, film1};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldOutputLastMoviesBoundaryValueEight() {
        BillboardsManager manager = new BillboardsManager(8); // Эквивалентные группы / Граничные значения: 8

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);
        manager.addNewMovie(film7);

        MovieObject[] expected = {film7, film6, film5, film4, film3, film2, film1};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldOutputLastThreeMoviesNotAdded() {
        BillboardsManager manager = new BillboardsManager(3);

        MovieObject[] expected = {};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
