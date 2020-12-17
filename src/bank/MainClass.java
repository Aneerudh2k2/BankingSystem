package bank;

import accounts.SavingsAccount;
import user.Customer;

public class MainClass {

	public static void main(String[] args) {
		
		Bank p1 = new Bank();
		SavingsAccount a = new SavingsAccount(283612542);
		
		System.out.println("Welcome to OOPS bank!!!");
		System.out.println("Hey "+Customer.name);
		p1.getAccounts(a);

	}
}
