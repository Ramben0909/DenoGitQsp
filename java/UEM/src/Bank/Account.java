package Bank;

public class Account {
	public String getUsername() {
		return username;
	}
	 
	public int getBalance() {
		return balance;
	}
	 
	public String getAccountType() {
		return accountType;
	}
	 
	public String getEmail() {
		return email;
	}
	 
	public String getAddress() {
		return address;
	}
	public int getAccountNo() {
		return this.accno;
	}
	
	  private int accno;
      private String username;
      private int balance;
      private String accountType;
      private String email;
      private String address;
      private static int gennumber = 21376234;
      public Account(String name,String email,String address,String accountType,int mindeposit) {
    	  this.accno=gennumber;
    	  gennumber++;
    	  this.username=name;
    	  this.balance=mindeposit;
    	  this.email=email;
    	  this.address=address;
    	  this.accountType=accountType;
    	  
	  }
	  public void withdraw(int value) {
    	  if(this.balance>value) {
    		  this.balance-=value;
    		  System.out.println("Amount deducted");
    	  }else {
    		  System.out.println("Not enough balance");
    	  }
      }
      public void deposit(int value) {
    	  if(value<=0) {
    		  System.out.println("Enter valid amount");
              return;
    	  }else {
    		  this.balance+=value;
    		  System.out.println("Amount credited :"+value);
    	  }
      }
      public void transfer(int accno,int value) {
    	  Account target = BM.bank.get(accno);
    	  if(target==null) {
    		  System.out.println("Account do not exist");
    		  return;
    	  }
    	  target.deposit(value);
    	  this.withdraw(value);
      }	  
}
