package bank;

import accounts.Account;
import user.Customer;

public class Bank {
	
	public int code = 2836;
	public String address = "TCE branch";
	
	public void getAccounts(Account A) {
		System.out.println("Name of the account holder: "+ Customer.name);
		System.out.println("Account number: "+A.number);
		System.out.println("Balance: "+A.balance);
	}

}
