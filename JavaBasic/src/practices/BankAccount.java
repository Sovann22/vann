package practices;

class BankAccount {
    String accountName;
    String accountNumber;
    String accountType;
    double balanceAmount;

    // Constructor
    public BankAccount(String accountName, String accountNumber, String accountType, double balanceAmount) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balanceAmount = balanceAmount;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balanceAmount += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balanceAmount) {
            balanceAmount -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Amount: " + balanceAmount);
    }
}

