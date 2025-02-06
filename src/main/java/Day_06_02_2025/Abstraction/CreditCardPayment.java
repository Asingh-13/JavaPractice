package Day_06_02_2025.Abstraction;

// Credit Card Payment Implementation
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void makePayment() {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card Number: ****" + cardNumber.substring(cardNumber.length() - 4));
        generateReceipt();
    }
}

// PayPal Payment Implementation
class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    void makePayment() {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Email: " + email);
        generateReceipt();
    }
}