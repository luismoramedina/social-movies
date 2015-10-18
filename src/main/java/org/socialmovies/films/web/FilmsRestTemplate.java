package org.socialmovies.films.web;

import org.socialmovies.films.data.Film;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luismoramedina
 */
@RequestMapping("/film")
@RestController
public class FilmsRestTemplate {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Film> get(@PathVariable String id) {
        Assert.hasLength(id, "user not filled");
        ArrayList<Film> films = new ArrayList<>();
        Film film = new Film();
        film.id = "1";
        film.name = "All about my mother";
        film.rating = 5;
        films.add(film);
        return films;
    }

}
