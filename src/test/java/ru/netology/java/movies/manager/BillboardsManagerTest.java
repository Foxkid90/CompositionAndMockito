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
    public void shouldOutputLastMoviesWithoutQuantity() {
        BillboardsManager manager = new BillboardsManager();

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);
        manager.addNewMovie(film7);

        MovieObject[] expected = {film7, film6, film5, film4, film3};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldOutputLastMovies() {
        BillboardsManager manager = new BillboardsManager(3);

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);
        manager.addNewMovie(film7);

        MovieObject[] expected = {film7, film6, film5};
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
    public void shouldOutputLastMoviesBoundaryValueOne() {
        BillboardsManager manager = new BillboardsManager(1); // Эквивалентные группы / Граничные значения: 1

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);
        manager.addNewMovie(film7);

        MovieObject[] expected = {film7};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldOutputLastMoviesBoundaryValueZero() {
        BillboardsManager manager = new BillboardsManager(0); // Эквивалентные группы / Граничные значения: 0

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);
        manager.addNewMovie(film7);

        MovieObject[] expected = {};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldOutputLastMoviesBoundaryValueMinusOne() {
        BillboardsManager manager = new BillboardsManager(-1); // Эквивалентные группы / Граничные значения: -1

        manager.addNewMovie(film1);
        manager.addNewMovie(film2);
        manager.addNewMovie(film3);
        manager.addNewMovie(film4);
        manager.addNewMovie(film5);
        manager.addNewMovie(film6);
        manager.addNewMovie(film7);

        MovieObject[] expected = {};
        MovieObject[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
