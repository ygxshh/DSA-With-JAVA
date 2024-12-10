package OOPsPillar;

class BankAccount {
    private double balance;  // Private field

    // Constructor to initialize the account balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter method to access the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to modify the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Initialize account with a balance
        account.deposit(500);  // Deposit money
        System.out.println("Balance: " + account.getBalance());  // Access balance using getter
        account.withdraw(200);  // Withdraw money
        System.out.println("Balance: " + account.getBalance());  // Access balance after withdrawal
    }
}
