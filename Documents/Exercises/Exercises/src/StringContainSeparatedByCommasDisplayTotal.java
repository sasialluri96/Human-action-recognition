import java.util.Scanner;
public class StringContainSeparatedByCommasDisplayTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String values = sc.nextLine();
        String[] markArrays = values.split(",");
        int total = 0;
        for(String mark:markArrays) {
            int markValues=Integer.parseInt(mark.trim());
            total = total+markValues;
        }
        System.out.println("TotalMarks"+total);
        
    }
    
}
