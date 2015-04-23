
package es.us.mwm.twitter.entities.trends;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trend_ {

    private Object events;
    private String name;
    private Object promoted_content;
    private String query;
    private String url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getEvents() {
        return events;
    }

    public void setEvents(Object events) {
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPromoted_content() {
        return promoted_content;
    }

    public void setPromoted_content(Object promoted_content) {
        this.promoted_content = promoted_content;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
