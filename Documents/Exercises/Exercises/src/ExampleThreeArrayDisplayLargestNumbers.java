import java.util.*;
public class ExampleThreeArrayDisplayLargestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        for(int number:numbers){
            if(number>largest){
                largest = number;
            }
        }
        System.out.println("Largest numbers" + largest);



    }    
    
}
