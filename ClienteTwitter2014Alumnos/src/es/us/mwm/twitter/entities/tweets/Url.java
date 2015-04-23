
package es.us.mwm.twitter.entities.tweets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Url {

    private String expanded_url;
    private String url;
    private List<Long> indices = new ArrayList<Long>();
    private String display_url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getExpanded_url() {
        return expanded_url;
    }

    public void setExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
