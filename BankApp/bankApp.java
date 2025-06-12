
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class Users {

    String name;
    int accountNumber;
    LocalDateTime time;

    public Users(String name, int accountNumber, LocalDateTime time) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.time = time;
    }

}

class Transaction {

    String type;                                //type of transaction
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

class CreateFile {

    void createFile(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (java.io.IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}

class saveDataToFile {

    void SaveToAfile(String data, String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            System.out.println("File name cannot be null or empty.");
            return;
        }
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(data + "\n");
            writer.close();
            System.out.println("Data saved to file successfully.");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while saving data to file.");
            e.printStackTrace();
        }
    }

}

class BankAccount {

    private String name;
    private double balance;
    private int accountNumber;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    ArrayList<Transaction> transactions = new ArrayList<>();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            CreateFile createFile = new CreateFile();
            createFile.createFile("transactions.txt");
            transactions.add(new Transaction("Deposit", amount));
            saveDataToFile saveToAfile = new saveDataToFile();
            saveToAfile.SaveToAfile("Deposited: " + amount + " to account number: " + accountNumber, "transactions.txt");
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    ArrayList<Users> users = new ArrayList<>();

    public void addUser(String name, int accountNumber, LocalDateTime time) {
        Users user = new Users(name, accountNumber, time);
        users.add(user);
        System.out.println("User added: " + name + " with account number " + accountNumber);
        CreateFile createFile = new CreateFile();
        createFile.createFile("users.txt");
        saveDataToFile saveToAfile = new saveDataToFile();
        saveToAfile.SaveToAfile("User: " + name + ", Account Number: " + accountNumber + ", Time: " + time, "users.txt");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            CreateFile createFile = new CreateFile();
            createFile.createFile("transactions.txt");
            saveDataToFile saveToAfile = new saveDataToFile();
            saveToAfile.SaveToAfile("Withdrawn: " + amount + " from account number: " + accountNumber, "transactions.txt");
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void ApplyForLoan(double amount) {
        System.out.println("Enter the amount you want to apply for loan: " + amount);
        System.out.println("Application for loan is under review.");
        System.out.println("Loan application submitted for amount: " + amount);
        balance += amount;
        transactions.add(new Transaction("Loan", amount));
        System.out.println("Loan amount added to your account balance.");
        System.out.println("Current balance: " + balance);
    }

    public void getBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class bankApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Application");
        Scanner sc = new Scanner(System.in);
        BankAccount account = null; // Initialize account to null
        while (true) {
            System.out.println("Enter Your Choice -->>");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("6. See transactions");
            System.out.println("7. Apply For Loan");
            System.out.println("8. See Users");
            System.out.println("Press Any to Exit");
            System.out.print("-->>");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.next();
                    int accountNumber = (int) (Math.random() * 1000000);
                    System.out.print("Enter initial balance: ");
                    double initialBalance = sc.nextDouble();
                    account = new BankAccount(name, accountNumber, initialBalance);
                    LocalDateTime currentTime = LocalDateTime.now();
                    System.out.println("Account created successfully for " + name + " with account number " + accountNumber);
                    Users user = new Users(name, accountNumber, currentTime);
                    account.addUser(name, accountNumber, currentTime);
                    System.out.println("Account created at: " + currentTime);
                    System.out.println("Current time: " + currentTime.toString());
                    System.out.println();

                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposited: " + depositAmount);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Withdrawn: " + withdrawAmount);
                    System.out.println();
                    break;

                case 4:
                    account.getBalance();
                    break;

                case 6:
                    ArrayList<Transaction> transactions = account.transactions;
                    if (transactions.isEmpty()) {
                        System.out.println("No transactions found.");
                        System.out.println();
                        break;
                    } else if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                        System.out.println();
                        break;
                    }
                    System.out.println("Transactions:");
                    for (Transaction t : account.transactions) {
                        System.out.println(t.type + ": " + t.amount);
                    }
                    System.out.println();
                    break;

                case 7:
                    System.out.print("Enter the amount you want to apply for loan: ");
                    double loanAmount = sc.nextDouble();
                    if (account == null) {
                        System.out.println("No account found. Please create an account first.");
                        System.out.println();
                        break;
                    }
                    account.ApplyForLoan(loanAmount);
                    System.out.println();
                    break;

                case 8:
                    // ArrayList<Users> users = account.users;
                    // if(users.isEmpty()) {
                    //     System.out.println("No users found.");
                    //     System.out.println();
                    //     break;
                    // }
                    // System.out.println("Users:");
                    // for (Users u : users) {
                    //     System.out.println("Name: " + u.name + ", Account Number: " + u.accountNumber + ", Time: " + u.time);
                    // }
                    try {
                        File file = new File("users.txt");
                        if (file.exists()) {
                            Scanner fileScanner = new Scanner(file);
                            while (fileScanner.hasNextLine()) {
                                String line = fileScanner.nextLine();
                                System.out.println(line);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("An error occurred while reading the file.");
                        e.printStackTrace();
                    }
                    System.out.println();

                    break;

                default:
                    return;
            }
        }

    }

}
