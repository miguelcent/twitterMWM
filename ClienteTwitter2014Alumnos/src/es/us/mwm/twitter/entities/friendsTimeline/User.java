package es.us.mwm.twitter.entities.friendsTimeline;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Entity into which the Twitter user is deserialized.
 *
 * @author Martin Matula
 */
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
   @XmlElement(name = "name")
    private String name;
    
    @XmlElement(name = "profile_image_url")
    private String profile_image_url;

    @XmlElement(name = "followers_count")
    private Long followers_count;

    public Long getFollowers_count() {
        return followers_count;
    }
    
    public String getName() {
        return name;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }
}
