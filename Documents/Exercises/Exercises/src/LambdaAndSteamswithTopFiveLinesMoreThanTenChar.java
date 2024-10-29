import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaAndSteamswithTopFiveLinesMoreThanTenChar {

    public static void main(String[] args) {
        String filePath = "/path/to/your/file.txt"; // Replace with your actual file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<String> lines = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            lines.stream()
                 .filter(line -> line.length() > 10)
                 .sorted(Comparator.comparingInt(String::length).reversed())
                 .limit(5)
                 .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}