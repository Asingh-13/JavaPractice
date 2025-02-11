package DAY_11_02_2025.Abstraction;

public class Car extends Vehicle {
    public  Car(String engine, int power, int noOfSeats){
        super(engine,power,noOfSeats);
    }
    @Override
    void start() {

    }

    @Override
    void stop() {

    }

    @Override
    String fuelType() {
        return "";
    }
}
