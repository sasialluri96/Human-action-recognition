import java.util.Scanner;
public class ReversingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n =sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for(int i=0;i<n;i++){
            array[i] =sc.nextInt();
        }
        System.out.println("Array in reverse order");
        for(int i=n-1;i>=0;i-- ){
            System.out.println(array[i]+" ");
        }
    }
    
}
