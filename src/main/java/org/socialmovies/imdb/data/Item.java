package org.socialmovies.imdb.data;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author luismoramedina
 */
public class Item {
    @XmlElement
    String pubDate;
    @XmlElement
    public
    String title;
    @XmlElement
    String link;
    @XmlElement
    String guid;
    @XmlElement
    public
    String description;

    @Override
    public String toString() {
        return "Item{" +
                "pubDate='" + pubDate + '\'' +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", guid='" + guid + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
