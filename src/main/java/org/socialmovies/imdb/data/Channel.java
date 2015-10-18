package org.socialmovies.imdb.data;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

/**
 * @author luismoramedina
 */
public class Channel {
    @XmlElement
    String title;
    @XmlElement
    String link;

    @XmlElement(name = "item")
    public
    ArrayList<Item> items;

    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", items=" + items +
                '}';
    }

}
