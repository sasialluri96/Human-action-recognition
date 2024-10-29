import java.util.Arrays;
import java.util.Scanner;
public class SecondMaximumElementOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<size;i++) {
            array[i] = sc.nextInt();

        }
        Arrays.sort(array);
        int SecondMaximumElement = array[size-2];
        System.out.println("Second Maximum Element af an Array is : " + SecondMaximumElement);
    }
    
}
