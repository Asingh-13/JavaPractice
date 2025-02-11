package DAY_11_02_2025.Abstraction;

abstract class Vehicle {
    private String engine; // It is highly recommended to declare data member / variable as
    // private
    private int power;
    private int noOfSeats;
    abstract void start();
    abstract void stop();
    abstract String fuelType();

    public Vehicle(String engine, int power, int noOfSeats) {
        this.engine = engine;
        this.power = power;
        this.noOfSeats = noOfSeats;
    }

}
