import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveBlankLines {
    public static void main(String[] args) {
        String inputFile = "/home/sasi/Documents/names.txt";
        String outputFile = "/home/sasi/Documents/capitals.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    writer.write(line); // Write non-empty lines to output
                }
            }

            System.out.println("Blank lines removed ");

        } catch (IOException e) {
            System.err.println( e);
        }
    }
}


