package Day_06_02_2025.Abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        // Using abstraction to handle different payment methods
        Payment payment1 = new CreditCardPayment(2500.75, "1234567812345678");
        Payment payment2 = new PayPalPayment(1500.50, "user@example.com");

        // Calling the abstract method (implementation is hidden)
        payment1.makePayment();
        System.out.println("----------------------");
        payment2.makePayment();
    }
}
