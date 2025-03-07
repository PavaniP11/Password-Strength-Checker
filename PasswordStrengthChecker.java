import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        input.close(); // Close scanner to prevent resource leak

        if (password.length() < 8) {
            System.out.println("Password is super weak");
            System.out.println("Password can be cracked in 10s");
        } 
        else if (password.matches("^[A-Z]+$")) {
            System.out.println("Password is weak");
            System.out.println("Password can be cracked in 30s");
        } 
        else if (password.matches("^[A-Za-z]+$")) {
            System.out.println("Password is moderate");
            System.out.println("Password can be cracked in 50s");
        } 
        else if (password.matches("^[A-Z0-9]+$")) {
            System.out.println("Password is moderate");
            System.out.println("Password can be cracked in 50s");
        } 
        else if (password.matches("^[a-z0-9]+$")) {
            System.out.println("Password is moderate");
            System.out.println("Password can be cracked in 50s");
        } 
        else if (password.matches("^[A-Za-z0-9]+$")) {
            System.out.println("Password is strong");
            System.out.println("Password can be cracked in 500s");
        } 
        else {
            System.out.println("Password is super strong");
            System.out.println("Password can be cracked in 1600s");
        }
    }
}

