package accounts;

import user.Customer;

public class SavingsAccount extends Account {
	public double interest = 0.5;
	public double minimumBalance = 1000.0;
	
	public SavingsAccount(long number) {
		super(number);
	}
	
	public void deposit(long accNumber, Customer u1, long amount) {
		if(u1.name.equals(Customer.name) == true && u1.password.equals(Customer.password) == true) {
			if(accNumber != 1234567890) {// imaginary account number
				System.out.println("Invalid account number!!!");
			}else {
				if(amount > this.balance) {
					System.out.println("Amount you entered is not in your account");
				}else {
					this.balance = this.balance + amount;
					System.out.println("Your current balance is "+this.balance);
				}
			}
		}else {
			System.out.println("Account holder doesnot exists!!!");
		}
		this.time = dtf.format(now);
		System.out.println("Last logged in: "+time);
	}
	
	public void transfer(Account depositor,Account nominee, Customer u2, long amount) throws Exception {
		if(u2.name.equals(Customer.name) == true && u2.password.equals(Customer.password) == true) {
			if(nominee.number != 1234567890) {// imaginary account number
				if(amount > nominee.balance) {
					System.out.println("Amount you entered is not in your account");
				}else {
					nominee.balance = nominee.balance + amount;
					depositor.balance = depositor.balance - amount;
					System.out.println("Balance of depositor: "+ depositor.balance);
					System.out.println("Successfully transfered!!");
				}
			}
		}
		this.time = dtf.format(now);
		System.out.println("Last logged in: "+time);
		if(depositor.balance < this.minimumBalance) {
			throw new MinimumBalanceException("Your SAVINGS ACCOUNT balance is lesser than minimum balance!!!!");
		}
	}
}	
//	public void transferToCurrentAcc(SavingsAccount depositor, CurrentAccount nominee, Customer u2, long amount) {
//		if(u2.name.equals(Customer.name) == true && u2.password.equals(Customer.password) == true) {
//			if(nominee.number != 1234567890) {// imaginary account number
//				if(amount > nominee.balance) {
//					System.out.println("Amount you entered is not in your account");
//				}else {
//					nominee.balance = nominee.balance + amount;
//					depositor.balance = depositor.balance - amount;
//					System.out.println("Balance of depositor: "+ depositor.balance);
//					System.out.println("Successfully transfered!!");
//				}
//			}
//		}
//		this.time = dtf.format(now);
//		System.out.println("Last logged in: "+time);
//		if(depositor.balance < this.minimumBalance) {
//			System.out.println("Your SAVINGS ACCOUNT balance is lesser than minimum balance!!!!");
//		}
//	}

