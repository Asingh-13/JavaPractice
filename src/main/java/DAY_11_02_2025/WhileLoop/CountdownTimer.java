package DAY_11_02_2025.WhileLoop;

public class CountdownTimer {
    public static void main(String[] args) throws InterruptedException {
        int time = 10;  // 10 seconds countdown

        while (time > 0) {
            System.out.println("Time left: " + time + " seconds");
            time--;
            Thread.sleep(1000);  // Wait for 1 second
        }

        System.out.println("Time's up!");
    }
}