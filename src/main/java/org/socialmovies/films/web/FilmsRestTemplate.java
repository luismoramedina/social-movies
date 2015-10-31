package org.socialmovies.films.web;

import org.socialmovies.films.data.Film;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luismoramedina
 */
@RestController
public class FilmsRestTemplate {

    @RequestMapping(value = "/{user}/films", method = RequestMethod.GET)
    @ResponseBody
    public List<Film> get(@PathVariable String user) {
        Assert.hasLength(user, "user not filled");
        ArrayList<Film> films = new ArrayList<>();
        Film film = new Film();
        film.id = "1";
        film.name = "All about my mother";
        film.rating = 5;
        films.add(film);
        films.add(film);
        films.add(film);
        return films;
    }

}
