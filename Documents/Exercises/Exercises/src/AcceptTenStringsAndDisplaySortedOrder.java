import java.util.Arrays;
import java.util.Scanner;
public class AcceptTenStringsAndDisplaySortedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        System.out.println("Enter ten strings");
        for(int i =0;i<array.length;i++) {
            array[i]= sc.nextLine();

        }
        Arrays.sort(array);
        for(String str:array){
            System.out.println("SortedStrings:"+str);

        }
    }
}