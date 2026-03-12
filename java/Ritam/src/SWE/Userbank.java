package SWE;

import Test.Bank;

public class Userbank implements Bank{
	private int bal=0;
	private String password="";
	
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void deposit(int val) {
		bal+=val;
	}
	public void withdrawl(int val) {
		if(val>bal) {
			System.out.println("Not enough balance");
		}else {
			bal-=val;
			System.out.println("balance deducted");
		}
	}
	public void fundtransfer() {
		System.out.println("Transferred");
	}
	public void checkbal() {
		System.out.println("Your curr balance is "+bal);
	}
	public void resetpass(String check,String pass) {
		if(check.equals(password)) {
			this.password=pass;
			System.out.println("Password changed");
		}else {
			System.out.println("Enter right password");
		}
	}
}
	