
import java.util.ArrayList;
import java.util.Scanner;

class Transaction {

    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

class Account {

    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    ArrayList<Transaction> transaction = new ArrayList<>();

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transaction.add(new Transaction("Deposit", amount));
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transaction.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }
    void applyLoan(double amount) {
        if (amount > 0) {
            balance += amount;
            transaction.add(new Transaction("Loan", amount));
            System.out.println("Loan of " + amount + " applied successfully.");
        } else {
            System.out.println("Invalid loan amount");
        }
    }

    void getbalance() {
        System.out.println("Balance: " + balance);
    }
}
public class bankApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank App");
        Scanner sc = new Scanner(System.in);
        Account account = null;
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Apply for Loan");
            System.out.println("Press any other key to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Create Account
                    System.out.print("Enter your name:");
                    String name = sc.next();
                    System.out.print("Enter your account number:");
                    int accountNumber = sc.nextInt();
                    System.out.print("Enter your initial balance:");
                    double initialBalance = sc.nextDouble();
                    account = new Account(name, accountNumber, initialBalance);
                    System.out.println("Account created successfully! for " + name);
                    break;
                case 2:
                    // Deposit
                    System.out.print("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);

                    break;
                case 3:
                    // Withdraw
                    System.out.print("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);

                    break;
                case 4:
                    // Check Balance
                    account.getbalance();
                    break;
                    case 5:
                    // Apply for Loan
                    System.out.print("Enter amount for loan:");
                    double loanAmount = sc.nextDouble();
                    account.applyLoan(loanAmount);
                    System.out.println("Loan applied successfully!");
                    break;

                default:
                    return;
            }
        }

    }

}
