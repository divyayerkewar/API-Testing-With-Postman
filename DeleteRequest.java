import java.net.URL;

import java.net.HttpURLConnection;

public class DeleteRequest { 
        
     public static void main(String[]args)throws Exception{


          URL myapiurl = new URL ("http://httpbin.org/delete");
      
          HttpURLConnection conn = (HttpURLConnection) myapiurl.openConnection();
           

           conn.setRequestMethod("DELETE");

          conn.setRequestProperty("Accept","application/json");

          int responseCode = conn.getResponseCode();
           System.out.println("Response code" + responseCode);



    
}
}