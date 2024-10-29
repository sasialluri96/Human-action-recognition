import java.io.*;
import java.util.Scanner;
public class TakeDataFromMarksTxtFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("marks.txt"));
            int ROllNo=1;
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] marks = line.split(",");
                int totalMarks = 0;
                for(String mark:marks){
                    try {
                        totalMarks= totalMarks+Integer.parseInt(mark);
                    } 
                    catch (Exception e) {
                        System.out.println(e);
                    }


                }
                System.out.println("rollNO " + ROllNo + "TotalMarks" + totalMarks);
                ROllNo++;
            }
        }
            
        catch (Exception e) {
            System.out.println(e);

        }
    }
    
}
