package org.socialmovies.imdb.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author luismoramedina
 */
@XmlRootElement(name = "rss")
public class RssImdb {

    @Override
    public String toString() {
        return "RssImdb{" +
                "channel=" + channel +
                '}';
    }

    @XmlElement(name = "channel")
    public Channel channel;

}

