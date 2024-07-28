import java.net.HttpURLConnection;


import java.net.URL;
import java.util.Scanner;


public class APITesting {
    public static void main(String [] args) throws Exception{
             String myapiUrl  = "https://jsonplaceholder.typicode.com/posts/2"; //api url
                 
              //url object
              URL url = new URL(myapiUrl);
              
              String A = "GET";
              //open connection to the  url 
              HttpURLConnection connection =(HttpURLConnection) url.openConnection();
              connection.setRequestMethod (A);


              // Get the response code

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode); // Expected - 200

        // Read the response
        
           Scanner scanner = new Scanner (connection.getInputStream()); // read the input stream
           StringBuilder responseD = new StringBuilder();
 
           while(scanner.hasNextLine()){    // checking there is a another line
            responseD.append(scanner.nextLine()); //read the next line from the input stream and append it 

           }
              scanner.close(); //close the scanner

        // Print the response data
        System.out.println("Response Data : " + responseD.toString());

        
        if (responseCode == 200) 
        {
            System.out.println("Test Passed!");
        } 
        
        else 
        {
            System.out.println("Test Failed!");
        }
    
    }
}






    

