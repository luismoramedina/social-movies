package org.socialmovies.util;

import org.socialmovies.imdb.data.RssImdb;
import org.socialmovies.users.data.User;
import org.springframework.web.client.RestTemplate;

/**
 * @author luismoramedina
 */
public class RssReader {

    public static void main(String[] args) {
        User user = new User();
        user.imdbId = "ur30922236";
        user.nickname = "lulu";
        user.email = "lulu@lulu.com";
        RssImdb data = (RssImdb) read(user.getImdbRssUri(), RssImdb.class);

        data.channel.items.forEach(t -> System.out.println(t.title + " -> " + getRate(t.description)));
    }

    public static String getRate(String description) {
        String[] tokens = description.split(" ");
        return tokens[tokens.length - 1].replaceAll("\\.", "").trim();
    }

    public static Object read(String url, Class<?> type) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, type);
    }

}
