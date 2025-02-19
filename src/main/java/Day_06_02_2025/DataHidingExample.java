package Day_06_02_2025;

public class DataHidingExample {
    public static void main(String[] args) {


        BankAccount account = new BankAccount("1234567890", 5000);

        // Attempting to access private fields directly (Not allowed)
        // account.balance = 10000;  // ERROR!

        // Controlled access to balance and account number
        System.out.println("Account Number: " + account.getMaskedAccountNumber());
        account.deposit(1000);
        account.withdraw(2000);

        // Balance remains hidden from direct access
        System.out.println("Final Balance (for audit only): $" + account.getBalanceForAudit());
    }
}