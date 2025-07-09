import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        String fileName = "output.txt";  // File to write
        String content = "Hello, this is a file writing example in Java!";

        try {
            // FileWriter is used for writing characters to file
            FileWriter fw = new FileWriter(fileName);

            // Optional: Use BufferedWriter for efficient writing
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(content);
            bw.newLine(); // Add a newline
            bw.write("This is the second line.");
            
            bw.close(); // Always close the stream
            System.out.println("Data written successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
