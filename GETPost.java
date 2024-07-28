
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GETPost {
    public static void main(String[] args) throws Exception {
        //  get posts by username
        String apiUrl = "https://jsonplaceholder.typicode.com/posts?username=Bret"; 

        // Create a URL object
        URL url = new URL(apiUrl);

        // Open a connection 
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Get the response code
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode); // Expected: 200

        
        Scanner scanner = new Scanner(connection.getInputStream());
        StringBuilder response = new StringBuilder();

        while (scanner.hasNextLine()) {
            response.append(scanner.nextLine());
        }
        scanner.close();

        // Print the response data
        System.out.println("Response Data: " + response.toString());

        
        if (responseCode == 200) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}
