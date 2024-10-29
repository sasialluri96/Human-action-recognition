import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class AcceptTwoDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First date(dd-mm-yyyy)");
        String startDateStr = sc.nextLine();
        System.out.println("Enter second date(dd-mm-yyyy)");
        String endDateStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        try {
            Date startDate = sdf.parse(startDateStr);
            Date endDate = sdf.parse(endDateStr);
            long difference = endDate.getTime()-startDate.getTime();
            long days = difference/24*60*60*1000;
            System.out.println("Number of days betweeen two dates"+days);

        }
        catch(ParseException e) {
            System.out.println("Invalid date");

        }

    }
    
}
    

