package DAY_11_02_2025.WhileLoop;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        final String correctUsername = "admin";
        final String correctPassword = "password123";
        int attempts = 3;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = scanner.next();
            System.out.print("Enter password: ");
            String password = scanner.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome.");
                break;
            } else {
                attempts--;
                System.out.println("Invalid credentials. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Too many failed attempts. Your account is locked.");
        }
        scanner.close();
    }
}

