package DAY_11_02_2025.Abstraction;

abstract class PaymentProcessor {
    abstract boolean validatePayment(String details);
    abstract void processPayment(double amount);

    public void generateReceipt(double amount) {
        System.out.println("Receipt generated for $" + amount);
    }
}

class CreditCardPayment extends PaymentProcessor {
    @Override
    boolean validatePayment(String cardNumber) {
        return cardNumber.matches("\\d{16}");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

class UPIPayment extends PaymentProcessor {
    @Override
    boolean validatePayment(String upiId) {
        return upiId.contains("@");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}
