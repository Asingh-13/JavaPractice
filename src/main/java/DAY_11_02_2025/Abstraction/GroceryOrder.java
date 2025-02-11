package DAY_11_02_2025.Abstraction;

class GroceryOrder extends Order {
    GroceryOrder(double basePrice) {
        super(basePrice);
    }

    @Override
    double calculateTotal() {
        return basePrice * 1.05;  // 5% tax
    }
}
