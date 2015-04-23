
package es.us.mwm.twitter.entities.trends;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trend {

    private String as_of;
    private String created_at;
    private List<Location> locations = new ArrayList<Location>();
    private List<Trend_> trends = new ArrayList<Trend_>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAs_of() {
        return as_of;
    }

    public void setAs_of(String as_of) {
        this.as_of = as_of;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Trend_> getTrends() {
        return trends;
    }

    public void setTrends(List<Trend_> trends) {
        this.trends = trends;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
