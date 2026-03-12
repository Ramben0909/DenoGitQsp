package User;

import Bank.userAccount;
import Hospital.useradmit;
import java.util.Scanner;

public class Primarymain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== SYSTEM INITIALIZATION ===");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();

        User currentUser = new User(name, email, addr);
        
        boolean exitSystem = false;
        while (!exitSystem) {
            System.out.println("\n--- MAIN MENU (User: " + currentUser.getName() + ") ---");
            System.out.println("1. BANKING OPERATIONS");
            System.out.println("2. HOSPITAL OPERATIONS");
            System.out.println("3. CREATE NEW USER");
            System.out.println("3. EXIT");
            System.out.print("Choice: ");
            int mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {
                case 1:
                    userAccount.manageBank(currentUser,sc);
                    break;
                case 2:
                    useradmit.manageHospital(currentUser,sc);
                    break;
                case 3:
                	System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    email = sc.nextLine();
                    System.out.print("Enter Address: ");
                    addr = sc.nextLine();
                    currentUser = new User(name, email, addr);
                    break;
                case 4:
                    exitSystem = true;
                    break;
                default:
                    System.out.println("Invalid Option.");
            }
        }
        sc.close();
    }
}