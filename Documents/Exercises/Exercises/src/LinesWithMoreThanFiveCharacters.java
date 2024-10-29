import java.util.Scanner;

public class LinesWithMoreThanFiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines (enter 'quit' to stop):");

        while (true) {
            String line = sc.nextLine(); 
            if (line.equalsIgnoreCase("quit")) { 
                break;
            }
            if (line.length() > 5) { 
                System.out.println("Lines: " + line); 
            }
        }
    }
}
