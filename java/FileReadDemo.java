import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        String fileName = "output.txt"; // Same file we wrote to

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Reading from file: " + fileName);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // Always close the stream
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
