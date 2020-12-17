package accounts;

import user.Customer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import atm.ATM;

class MinimumBalanceException extends Exception{

	public MinimumBalanceException(String msg) {
		super(msg);
	}
}

public abstract class Account {
	
	public long number;
	public static long balance = ATM.getBalance();
//	public long balance = 999; // assuming lower balance
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now(); 
	public String time;
	
	public Account(long number) {
		this.number = number;
	}

	public abstract void deposit(long accNumber, Customer u1, long amount);
	
	public abstract void transfer(Account depositor, Account nominee, Customer u2, long amount) throws Exception;
	
}
