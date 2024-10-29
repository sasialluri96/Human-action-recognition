import java.util.Scanner;
public class AcceptStringAndDisplayInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(".Enter a String");
        String input = sc.nextLine();
        String reversedString = "";
        for(int i =input.length()-1;i>=0;i--) {
            reversedString = reversedString+input.charAt(i);

        }
        System.out.println("ReversedString:" + reversedString);

        
    }
    
}
