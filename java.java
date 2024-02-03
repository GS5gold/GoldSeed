import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WebsiteSearch {
    public static void main(String[] args) {
        // Define the mapping of keywords to URLs
        Map<String, String> keywordMapping = new HashMap<>();
        keywordMapping.put("keyword1", "https://example.com/page1");
        keywordMapping.put("keyword2", "https://example.com/page2");
        keywordMapping.put("keyword3", "https://example.com/page3");
        // Add more keywords and URLs as needed

        // Get the search query from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your search query: ");
        String searchQuery = scanner.nextLine().toLowerCase();

        // Check if the search query matches any keyword
        if (keywordMapping.containsKey(searchQuery)) {
            // Redirect the user to the corresponding URL
            String url = keywordMapping.get(searchQuery);
            System.out.println("Redirecting to: " + url);
            // You can open the URL in a web browser using external libraries or frameworks
            // For simplicity, we are just printing the URL here
        } else {
            // If no match found, display an error message or handle it accordingly
            System.out.println("No matching result found!");
        }
    }
}