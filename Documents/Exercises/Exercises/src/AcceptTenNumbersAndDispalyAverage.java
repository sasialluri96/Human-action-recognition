import java.util.InputMismatchException;
import java.util.Scanner;
public class AcceptTenNumbersAndDispalyAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum =0;
        int count = 0;
        int totalNumbers = 10;
        while(count<totalNumbers){
            System.out.println("Numbers "+(count+1)+":");
            try {
                double numbers = sc.nextDouble();
                if(numbers<0){
                    System.out.println("Negative numbers are silently ignore");
                }
                else {
                    sum = sum+numbers;
                    count++;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid");
            }


        }
        System.out.println("Sum of PositiveNumbers" + sum);

        
    }
    
}
