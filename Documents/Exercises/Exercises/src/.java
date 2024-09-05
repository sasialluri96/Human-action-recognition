import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveBlankLines {
    public static void main(String[] args) {
        String originalFileName = "input.txt"; // Replace with your input file name
        String outputFileName = "output.txt"; // Replace with your output file name

        // First part: Remove blank lines
        try (BufferedReader reader = new BufferedReader(new FileReader(originalFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }

        // Second part: Display the original file contents
        System.out.println("Original File:");
        try (BufferedReader reader = new BufferedReader(new FileReader(originalFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the original file: " + e.getMessage());
        }
    }
}
