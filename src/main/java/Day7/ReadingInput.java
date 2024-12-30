package Day7;

import java.io.Console;
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) throws InterruptedException {
        clearConsole();  // Clear the console before taking input
        takingInputFromConsole();
    }

    public static void clearConsole() {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                Runtime.getRuntime().exec("cls");
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.err.println("Error clearing console: " + e.getMessage());
        }
    }

    private static void takingInputFromConsole() throws InterruptedException {
        Console console = System.console();

        if (console == null) {
            // Fallback to Scanner if console is not available
            System.out.println("Console not available, switching to Scanner for input.");
            takingInputFromScanner();
            return;
        }

        System.out.println("Enter Username");
        String str = console.readLine();

        System.out.println("Enter Password");
        char[] pass = console.readPassword();

        System.out.println("Username : " +  str + " Pass : " + new String(pass));
    }

    private static void takingInputFromScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String str = sc.nextLine();
        System.out.println("Enter Password");
        String pass = sc.nextLine();

        System.out.println("Username : " +  str + " Pass : " + pass);
    }
}
