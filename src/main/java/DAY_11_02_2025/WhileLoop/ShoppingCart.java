package DAY_11_02_2025.WhileLoop;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter item price (0 to checkout): ");
            double price = scanner.nextDouble();

            if (price == 0) {
                break;
            }

            total += price;
            System.out.println("Total: $" + total);
        }

        System.out.println("Final Bill: $" + total);
        scanner.close();
    }
}

