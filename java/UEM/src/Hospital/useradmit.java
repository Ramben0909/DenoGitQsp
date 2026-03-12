package Hospital;

import Bank.BM;
import Bank.Account;
import User.User;
import java.util.Scanner;

public class useradmit {
    // Modified to accept the shared Scanner from Primarymain
    public static void manageHospital(User u, Scanner sc) {
        
        System.out.println("\n--- Hospital Admission Registry ---");
        System.out.print("Enter Bank Account Number to link for billing: ");
        int linkedAcc = sc.nextInt();
        sc.nextLine(); // Clear buffer

        // 1. Logic to deduct 3000 for admission fee
        Account userAcc = BM.bank.get(linkedAcc);

        if (userAcc == null) {
            System.out.println("Error: Bank Account not found. Admission cancelled.");
            return; // Exit if account doesn't exist
        }

        // Check balance before proceeding
        if (userAcc.getBalance() < 3000) {
            System.out.println("Error: Insufficient funds for admission (Fee: 3000). Admission cancelled.");
            return; // Exit if balance is low
        }

        // 2. Perform the deduction
        userAcc.withdraw(3000);
        System.out.println("3000 deducted from Account " + linkedAcc + " as admission fee.");

        // 3. Creating Patient with the provided account number
        Patient p = new Patient(u.getName(), linkedAcc, u.getEmail());
        Admisson.hospital.put(p.getPatientNo(), p);
        
        System.out.println("Admission Successful for " + u.getName() + " (ID: " + p.getPatientNo() + ")");

        boolean back = false;
        while (!back) {
            System.out.println("\n--- HOSPITAL OPERATIONS (ID: " + p.getPatientNo() + ") ---");
            System.out.println("1. View Patient Details");
            System.out.println("2. View Linked Account Number");
            System.out.println("3. Go Back to Main Menu");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Name: " + p.getName() + " | Email: " + p.getEmail());
                    break;
                case 2:
                    System.out.println("This record is linked to Account: " + linkedAcc);
                    break;
                case 3:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid Option.");
            }
        }
    }
}