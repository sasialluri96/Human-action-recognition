import java.util.Scanner;
public class DisplaySumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter numbers(Enter'0' to stop)");
        while(true){
            int numbers=sc.nextInt();
            if(numbers==0){
                break;
            }
            if(numbers>0) {
                sum=sum+numbers;
            }

        }
        System.out.println("Sum of Positive Numbers" + sum);
    }
}