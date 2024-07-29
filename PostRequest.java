import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostRequest {
     public static void main(String[] args)throws Exception{

        URL myapiurl = new URL("http://httpbin.org/post");

        String JSONInput = "{\"name\" : \"Divya\"}";

           HttpURLConnection conn = (HttpURLConnection) myapiurl.openConnection();

        conn.setRequestProperty("Content-Type","application/json");
        conn.setRequestProperty("Accept","application/json");
        conn.setRequestMethod("POST");

       OutputStream output = conn.getOutputStream()



      int responseCode = conn.getResponseCode();
      System.out.println("Response  Code" + responseCode);


     }
}