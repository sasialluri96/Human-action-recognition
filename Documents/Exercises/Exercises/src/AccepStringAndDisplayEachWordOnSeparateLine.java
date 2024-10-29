import java.util.Scanner;
public class AccepStringAndDisplayEachWordOnSeparateLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String inputString = sc.nextLine();
        String[] words = inputString.split("\\s+");
        for(String word:words){
            System.out.println(word);
        }
    }
}