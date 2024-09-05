import java.util.Scanner;
public class AcceptAStringAndDisplayThePositionOfSpaceForAllSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Spaces = sc.nextLine();
        for(int i=0;i<Spaces.length();i++) {
            if (Spaces.charAt(i) == ' ') {
                System.out.println("Position for all Spaces:" + i);
            }
        }
    }
}