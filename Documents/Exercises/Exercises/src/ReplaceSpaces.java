import java.nio.file.*;
public class ReplaceSpaces {
    public static void main(String[] args) {
        String inputFile = "/home/sasi/Documents/read.txt";
        String outputFile = "home/sasi/Documnets/write.txt";
        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));  // Read the content of the file
            String updatedContent =content.replaceAll("\\s+", " ");//Replace one or more spaces with a single space
            Files.write(Paths.get(outputFile), updatedContent.getBytes());// Write the updated content to the output file
            System.out.println("Spaces have been replaced " + outputFile);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
