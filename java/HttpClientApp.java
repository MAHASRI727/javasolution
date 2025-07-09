// Save as HttpClientApp.java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientApp {
    public static void main(String[] args) {
        // URL to fetch data from
        String url = "https://jsonplaceholder.typicode.com/posts/1";

        // Create HTTP Client
        HttpClient client = HttpClient.newHttpClient();

        // Build GET request
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create(url))
                                         .GET()
                                         .build();

        try {
            // Send request and get response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print status code and body
            System.out.println("✅ Status Code: " + response.statusCode());
            System.out.println("📦 Response Body:\n" + response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
