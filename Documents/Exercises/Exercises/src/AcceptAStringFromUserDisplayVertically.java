import java.util.Scanner;
public class AcceptAStringFromUserDisplayVertically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        for(int i=0;i<user.length(); i++) {
            System.err.println(user.charAt(i));
        }
    }
}