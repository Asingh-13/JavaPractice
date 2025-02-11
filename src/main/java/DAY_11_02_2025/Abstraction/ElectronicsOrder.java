package DAY_11_02_2025.Abstraction;

public class ElectronicsOrder extends Order {
    ElectronicsOrder(double basePrice) {
        super(basePrice);
    }

    @Override
    double calculateTotal() {
        return basePrice * 1.18;  // 18% tax
    }
}

