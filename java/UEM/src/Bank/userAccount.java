package Bank;

import User.User;
import java.util.Scanner;

public class userAccount {
    
    public static void manageBank(User u, Scanner sc) {
        // 1. CLEAR BUFFER: In case Primarymain left a newline
        if (sc.hasNextLine()) {
            sc.nextLine(); 
        }

        System.out.println("\n--- Opening New Account for " + u.getName() + " ---");
        
        System.out.print("Enter Account Type (e.g., Savings/Current): ");
        String type = sc.nextLine(); 
        
        System.out.print("Enter Initial Deposit: ");
        // Safety check to prevent InputMismatchException if user types text
        while (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a whole number for the deposit.");
            sc.next(); // Clear the invalid input
        }
        int balance = sc.nextInt();
        sc.nextLine(); // CRITICAL: Clear the newline after nextInt()

        // 2. CREATE OBJECT: Ensure gennumber in Account class is 'static'
        Account acc = new Account(u.getName(), u.getEmail(), u.getAddress(), type, balance);
        
        // 3. STORE IN DATABASE: Using the account number as key
        BM.bank.put(acc.getAccountNo(), acc);
        
        System.out.println("\n----------------------------------");
        System.out.println("Account Created Successfully!");
        System.out.println("Account Number: " + acc.getAccountNo());
        System.out.println("Starting Balance: " + acc.getBalance());
        System.out.println("----------------------------------");

        // 4. SUB-MENU OPERATIONS
        boolean back = false;
        while (!back) {
            System.out.println("\n--- BANK OPERATIONS (Acc: " + acc.getAccountNo() + ") ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Back to Main Menu");
            System.out.print("Select: ");
            
            if (!sc.hasNextInt()) {
                sc.next(); // Clear garbage input
                continue;
            }
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer after selection

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    if (sc.hasNextInt()) {
                        acc.deposit(sc.nextInt());
                    }
                    sc.nextLine(); // Clear buffer
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    if (sc.hasNextInt()) {
                        acc.withdraw(sc.nextInt());
                    }
                    sc.nextLine(); // Clear buffer
                    break;
                case 3:
                    System.out.println("Current Balance: " + acc.getBalance());
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}