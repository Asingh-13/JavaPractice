package Day_06_02_2025.Abstraction;

// Abstract class defining the blueprint for all payment methods
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method to be implemented by subclasses
    abstract void makePayment();

    // Common method (Concrete)
    public void generateReceipt() {
        System.out.println("Receipt generated for amount: $" + amount);
    }
}

