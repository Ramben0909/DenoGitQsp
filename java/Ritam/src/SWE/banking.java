package SWE;

 

public class banking extends Userbank {
    public static void main(String[] args) { 
        banking user1 = new banking(); 
        user1.deposit(2000);
        user1.checkbal();
        user1.getBal();
    }
}