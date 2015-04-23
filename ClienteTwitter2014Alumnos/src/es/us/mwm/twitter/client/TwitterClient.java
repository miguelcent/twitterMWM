package es.us.mwm.twitter.client;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 *
 * @author afernandez
 */
public class TwitterClient {

    //TODO: 2. Incluir la URI del servicio REST
    
    private static Integer numeroLlamadas = 0;
    private static final String FRIENDS_TIMELINE_URI = "https://api.twitter.com/1.1/statuses/home_timeline.json";
    private static final String USER_TIMELINE_URI = "https://api.twitter.com/1.1/statuses/user_timeline.json";
    private static final String UPDATE_TWEET_URI = "https://api.twitter.com/1.1/statuses/update.json";
    private static final String TRENDING_TOPIC_URI = "https://api.twitter.com/1.1/trends/place.json?id=23424950";
    private Client client;

    public TwitterClient() {
        try {
            client = TwitterAuthorization.createClient();
        } catch (Exception ex) {
            Logger.getLogger(TwitterClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    public Response getFriendsTimeline() {
        System.out.println("Numero de llamadas: "+numeroLlamadas);
        final Response response = client.target(FRIENDS_TIMELINE_URI).request().get();

        //TODO: 3. Llamada al servicio
        if (response.getStatus() != 200) {
            String errorEntity = null;
            if (response.hasEntity()) {
                errorEntity = response.readEntity(String.class);
            }
            throw new RuntimeException("La petición a twitter no tuvo éxito. Código de respuesta: "
                    + response.getStatus() + ", razón: " + response.getStatusInfo().getReasonPhrase()
                    + ", entity: " + errorEntity);
        }
        return response;
    }

    public Response getUserTimeLine() {
        System.out.println("Numero de llamadas: "+numeroLlamadas);

        final Response response = client.target(USER_TIMELINE_URI).request().get();

        if (response.getStatus() != 200) {
            String errorEntity = null;
            if (response.hasEntity()) {
                errorEntity = response.readEntity(String.class);
            }
            throw new RuntimeException("La petición a twitter no tuvo éxito. Código de respuesta: "
                    + response.getStatus() + ", razón: " + response.getStatusInfo().getReasonPhrase()
                    + ", entity: " + errorEntity);
        }
        return response;
    }

    public void setTweet(String msg) {
        System.out.println("Numero de llamadas: "+numeroLlamadas);

        MultivaluedMap<String, String> parametros = new MultivaluedHashMap<>();
        parametros.add("status", msg);
        final Response response = client.target(UPDATE_TWEET_URI).request().post(Entity.form(parametros));

        if (response.getStatus() != 200) {
            String errorEntity = null;

            if (response.hasEntity()) {
                errorEntity = response.readEntity(String.class
                );
            }
            throw new RuntimeException("La petición a twitter no tuvo éxito. Código de respuesta: "
                    + response.getStatus() + ", razón: " + response.getStatusInfo().getReasonPhrase()
                    + ", entity: " + errorEntity);
        }

    }

    public Response getTrendingTopics(String woid) {
        System.out.println("Numero de llamadas: "+numeroLlamadas);

        //España WOID=23424950
        final Response response = client.target(TRENDING_TOPIC_URI).queryParam("id", woid).request().get();

        if (response.getStatus() != 200) {
            String errorEntity = null;
            if (response.hasEntity()) {
                errorEntity = response.readEntity(String.class);
            }
            throw new RuntimeException("La petición a twitter no tuvo éxito. Código de respuesta: "
                    + response.getStatus() + ", razón: " + response.getStatusInfo().getReasonPhrase()
                    + ", entity: " + errorEntity);
        }
        return response;
    }
    
    //TODO: 4. Incluir métodos para llamar a otros servicios: UserTimeline, Update, Trends, etc.
}
