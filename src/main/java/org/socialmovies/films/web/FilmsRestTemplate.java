package org.socialmovies.films.web;

import org.socialmovies.films.data.Film;
import org.socialmovies.imdb.data.Item;
import org.socialmovies.imdb.data.RssImdb;
import org.socialmovies.users.data.User;
import org.socialmovies.util.RssReader;
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

        User imdbUser = new User();
        imdbUser.nickname = user;
        imdbUser.imdbId = "ur30922236";
        imdbUser.email = "lulu@lulu.com";

        RssImdb data = (RssImdb) RssReader.read(imdbUser.getImdbRssUri(), RssImdb.class);

        ArrayList<Film> films = new ArrayList<>();

        ArrayList<Item> items = data.channel.items;
        for (Item item : items) {
            Film film = new Film();
            film.name = item.title;
            film.rating = Integer.valueOf(RssReader.getRate(item.description));
            films.add(film);
        }
        return films;
    }

}
