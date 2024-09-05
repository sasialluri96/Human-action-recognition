import java.util.*;
public class ArrayOfTenElementsFillRandomNumbersInEvenOdd {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();
        for(int i=0;i<num.length;i++){
            num[i] = random.nextInt(100);

        }
        for(int numbers:num){
            if(numbers%2==0){
                System.out.println("EvenNumbers"+ numbers);
            }
            else {
                System.out.println("OddNumbers" + numbers);
            }
        }

    }
    
}
