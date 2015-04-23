
package es.us.mwm.twitter.entities.tweets;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entities_ {

    private Url_ url;
    private Description description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Url_ getUrl() {
        return url;
    }

    public void setUrl(Url_ url) {
        this.url = url;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
