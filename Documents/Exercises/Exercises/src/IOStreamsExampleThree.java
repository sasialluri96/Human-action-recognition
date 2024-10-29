import java.io.*;
import java.util.*;
public class IOStreamsExampleThree {
    public static void main(String[] args) {
        try {
           Scanner sc = new Scanner(System.in);
           ArrayList<String>names = new ArrayList<>();
           System.out.println("Enter name(type END to finish)");
           String input=sc.nextLine();
           while (true) { 
        
            if(input.equals("END")){
                break;
            }
            names.add(input);
               
           }
           Collections.sort(names);
           PrintWriter writer = new PrintWriter("names.txt");
           for(String name:names) {
            writer.println(name);

           }
           System.out.println("Written names.txt file into sortedorder");


        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
