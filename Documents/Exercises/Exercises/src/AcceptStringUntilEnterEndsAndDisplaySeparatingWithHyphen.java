import java.util.ArrayList;
import java.util.Scanner;
public class AcceptStringUntilEnterEndsAndDisplaySeparatingWithHyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>string = new ArrayList<>();
        String input;
        System.out.println("Enter Strings(type End to finish)");
        while(true) {
            input = sc.nextLine();
            if(input.equals("End")) {
                 break;
            }
            string.add(input);
        }
        String result = String.join("-", string);
        System.out.println(result);

    
       

    }
}
