import java.util.regex.*;
public class FunctionThatTakesAPassword {
    public static boolean isValidPassword(String password){
        // Regular expression to check for at least one digit, one uppercase letter, and one special character
        String regex = "^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=[\]{}\\|;:,.<>?/]).+$";

        return Pattern.compile(regex).matcher(password).find();
    }

    public static void main(String[] args) {
        String password = "MyStrongPassword@123";

        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}