package SWE;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        boolean con = true;
        Scanner sc = new Scanner(System.in);
        Library myli = new Library();
        
        while (con) {
            System.out.println("Enter option: 1 for borrow, 2 for return, 3 for read, 4 for exit");
            int op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1: {
                    System.out.println("Enter the name to borrow");
                    String name = sc.nextLine();
                    Book b = myli.borrow(name);
                    System.out.println("The book I got: " + b.getTitle());
                    break;
                }

                case 2: {
                    System.out.println("Enter the name");
                    String name = sc.nextLine();
                    System.out.println("Enter the author");
                    String author = sc.nextLine();
                    System.out.println("Enter the publish date");
                    String pdate = sc.nextLine();
                    System.out.println("Enter the price");
                    int price = sc.nextInt();
                    sc.nextLine(); 

                    myli.returnbook(new Book(name, author, pdate, price));
                    break;
                }

                case 3: {
                    System.out.println("Enter the name");
                    String name = sc.nextLine();
                    myli.read(name);
                    break;
                }

                case 4: {
                    con = false;
                    System.out.println("Exiting...");
                    break;
                }

                default:
                    System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}
