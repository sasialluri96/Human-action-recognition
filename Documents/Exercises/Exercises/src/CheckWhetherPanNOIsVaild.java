import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckWhetherPanNOIsVaild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PanNumber = sc.nextLine();
        String PanPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        Pattern pattern = Pattern.compile(PanPattern);
        Matcher matcher = pattern.matcher(PanNumber);
        if(matcher.matches()) {
            System.out.println("Valid PanNumber");
        }
        else {
            System.out.println("Invalid PanNumber");
        }

    }
    
}
