
package es.us.mwm.twitter.entities.tweets;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String profile_sidebar_fill_color;
    private String profile_sidebar_border_color;
    private Boolean profile_background_tile;
    private String name;
    private String profile_image_url;
    private String created_at;
    private String location;
    private Boolean follow_request_sent;
    private String profile_link_color;
    private Boolean is_translator;
    private String id_str;
    private Entities_ entities;
    private Boolean default_profile;
    private Boolean contributors_enabled;
    private Long favourites_count;
    private String url;
    private String profile_image_url_https;
    private Long utc_offset;
    private Long id;
    private Boolean profile_use_background_image;
    private Long listed_count;
    private String profile_text_color;
    private String lang;
    private Long followers_count;
    private Boolean _protected;
    private Object notifications;
    private String profile_background_image_url_https;
    private String profile_background_color;
    private Boolean verified;
    private Boolean geo_enabled;
    private String time_zone;
    private String description;
    private Boolean default_profile_image;
    private String profile_background_image_url;
    private Long statuses_count;
    private Long friends_count;
    private Object following;
    private Boolean show_all_inline_media;
    private String screen_name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }

    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    public Boolean getProfile_background_tile() {
        return profile_background_tile;
    }

    public void setProfile_background_tile(Boolean profile_background_tile) {
        this.profile_background_tile = profile_background_tile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getFollow_request_sent() {
        return follow_request_sent;
    }

    public void setFollow_request_sent(Boolean follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
    }

    public String getProfile_link_color() {
        return profile_link_color;
    }

    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }

    public Boolean getIs_translator() {
        return is_translator;
    }

    public void setIs_translator(Boolean is_translator) {
        this.is_translator = is_translator;
    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public Entities_ getEntities() {
        return entities;
    }

    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    public Boolean getDefault_profile() {
        return default_profile;
    }

    public void setDefault_profile(Boolean default_profile) {
        this.default_profile = default_profile;
    }

    public Boolean getContributors_enabled() {
        return contributors_enabled;
    }

    public void setContributors_enabled(Boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }

    public Long getFavourites_count() {
        return favourites_count;
    }

    public void setFavourites_count(Long favourites_count) {
        this.favourites_count = favourites_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }

    public Long getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(Long utc_offset) {
        this.utc_offset = utc_offset;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getProfile_use_background_image() {
        return profile_use_background_image;
    }

    public void setProfile_use_background_image(Boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
    }

    public Long getListed_count() {
        return listed_count;
    }

    public void setListed_count(Long listed_count) {
        this.listed_count = listed_count;
    }

    public String getProfile_text_color() {
        return profile_text_color;
    }

    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Long getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(Long followers_count) {
        this.followers_count = followers_count;
    }

    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public Object getNotifications() {
        return notifications;
    }

    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    public String getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }

    public void setProfile_background_image_url_https(String profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
    }

    public String getProfile_background_color() {
        return profile_background_color;
    }

    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Boolean getGeo_enabled() {
        return geo_enabled;
    }

    public void setGeo_enabled(Boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDefault_profile_image() {
        return default_profile_image;
    }

    public void setDefault_profile_image(Boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
    }

    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

    public Long getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(Long statuses_count) {
        this.statuses_count = statuses_count;
    }

    public Long getFriends_count() {
        return friends_count;
    }

    public void setFriends_count(Long friends_count) {
        this.friends_count = friends_count;
    }

    public Object getFollowing() {
        return following;
    }

    public void setFollowing(Object following) {
        this.following = following;
    }

    public Boolean getShow_all_inline_media() {
        return show_all_inline_media;
    }

    public void setShow_all_inline_media(Boolean show_all_inline_media) {
        this.show_all_inline_media = show_all_inline_media;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
