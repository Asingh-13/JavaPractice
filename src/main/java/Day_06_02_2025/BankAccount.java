package Day_06_02_2025;

// Secure Bank Account Management
class BankAccount {
    private String accountNumber;  // Hidden data
    private double balance;        // Hidden data

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter method with controlled access
    public String getMaskedAccountNumber() {
        return "****" + accountNumber.substring(accountNumber.length() - 4);
    }

    // Deposit method: Controlled modification of balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: RS" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method with validation
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: RS" + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount!");
            return false;
        }
    }

    // Get balance securely (only authorized personnel should access in real-world apps)
    public double getBalanceForAudit() {
        return balance;
    }
}
