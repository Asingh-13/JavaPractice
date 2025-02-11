package DAY_11_02_2025.Abstraction;

abstract class Order {
    double basePrice;

    Order(double basePrice) {
        this.basePrice = basePrice;
    }

    abstract double calculateTotal();

    public void shipOrder() {
        System.out.println("Order is being shipped!");
    }
}



