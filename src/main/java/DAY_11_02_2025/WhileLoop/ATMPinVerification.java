package DAY_11_02_2025.WhileLoop;

import java.util.Scanner;

public class ATMPinVerification {
    public static void main(String[] args) {
        int correctPin = 1234;
        int attempts = 3;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0){
            System.out.println("Enter the Pin ");
            int enteredPin = scanner.nextInt();
            scanner.nextLine();
            if (enteredPin == correctPin) {
                System.out.println("PIN correct! Access granted.");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect PIN. Attempts left: " + attempts);
            }
        }
    }
}
