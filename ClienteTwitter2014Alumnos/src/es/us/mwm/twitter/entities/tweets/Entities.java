
package es.us.mwm.twitter.entities.tweets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entities {

    private List<Url> urls = new ArrayList<Url>();
    private List<Object> hashtags = new ArrayList<Object>();
    private List<Object> user_mentions = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getUser_mentions() {
        return user_mentions;
    }

    public void setUser_mentions(List<Object> user_mentions) {
        this.user_mentions = user_mentions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
