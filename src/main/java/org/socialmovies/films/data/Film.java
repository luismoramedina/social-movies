package org.socialmovies.films.data;

/**
 * @author luismoramedina
 */
public class Film {
    public String id;
    public String name;
    public Integer rating;

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
