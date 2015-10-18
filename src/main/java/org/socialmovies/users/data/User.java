package org.socialmovies.users.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author luismoramedina
 */
@JsonIgnoreProperties({"imdbRssUri"})
public class User {
    public String nickname;
    public String email;
    public String imdbId;
    public String password;
    public String repeat;

    public String getImdbRssUri() {
        return "http://rss.imdb.com/user/" + imdbId + "/ratings";
    }

    public void clearPasswords() {
        password = null;
        repeat = null;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", imdbId='" + imdbId + '\'' +
                ", password='" + password + '\'' +
                ", repeat='" + repeat + '\'' +
                '}';
    }
}
