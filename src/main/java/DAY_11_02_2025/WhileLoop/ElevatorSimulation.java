package DAY_11_02_2025.WhileLoop;

import java.util.Scanner;

public class ElevatorSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the destination floor (1-10): ");
        int destination = scanner.nextInt();
        int currentFloor = 1;

        while (currentFloor < destination) {
            System.out.println("Elevator at floor: " + currentFloor);
            currentFloor++;
        }

        System.out.println("Elevator reached floor: " + destination);
        scanner.close();
    }
}
