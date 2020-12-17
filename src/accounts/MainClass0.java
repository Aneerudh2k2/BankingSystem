package accounts;

import java.util.*;
import user.Customer;

public class MainClass0 {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to OOPS bank!");
		// after login system done in user package from customer class
		// inside the application
		
		System.out.print("Choose your Account type?(savings/current) ");
		String accType = sc.nextLine();
		
		switch(accType) {
		
			case "savings":
				
				System.out.print("Which service need to be done?(deposit/transfer) ");
				String choice = sc.nextLine();
				
				switch(choice) {
					case "deposit":
						// I'm giving name and password which is already exists
						// but actual application it get value from user
						
						System.out.print("Enter the account number: ");
						long ac = sc.nextLong();
						
						Customer u1 = new Customer("OOPS","oopsbank.password");
						SavingsAccount a1 = new SavingsAccount(ac);
						
						System.out.print("Enter the amount you want to deposit: ");
						long amount = sc.nextLong();
						
						a1.deposit(ac, u1, amount);
						break;
						
					case "transfer": 
						System.out.print("Do you want to transfer money to Savings account?(y/n) ");
						char c = sc.next().charAt(0);
						
						if(c == 'y') {
							System.out.print("Enter the nominee account number: ");
							long nAccNum = sc.nextLong();
							
							Customer u2 = new Customer("OOPS","oopsbank.password");
							SavingsAccount a2 = new SavingsAccount(1234567890);				
							
							System.out.print("Enter the amount you want to transfer: ");
							long amt = 0;
							try {
								amt = sc.nextLong();
								SavingsAccount nominee = new SavingsAccount(nAccNum);
								a2.transfer(a2,nominee,u2,amt);
							}catch(Exception e) {
								System.out.println("Exception: "+e);
							}

							
							
						}
						else if(c == 'n') {
							System.out.print("Enter the nominee account number: ");
							long nAccNum = sc.nextLong();
							
							Customer u2 = new Customer("OOPS","oopsbank.password");
							SavingsAccount a2 = new SavingsAccount(1234567890);				
							
							System.out.print("Enter the amount you want to transfer: ");
							long amt = 0;
							try {
								amt = sc.nextLong();
								CurrentAccount nominee = new CurrentAccount(nAccNum);
								a2.transfer(a2,nominee,u2,amt);
							}catch(Exception e) {
								System.out.println("Exception: "+e);
							}
							
							
						}
						break;
					default:
						System.out.println("Enter the valid service!!!");
				}	
				break;
				
			case "current":
				System.out.print("Which service need to be done?(deposit/transfer) ");
				String Servicechoice = sc.nextLine();
				
				switch(Servicechoice) {
					case "deposit":
						// I'm giving name and password which is already exists
						// but actual application it get value from user
						System.out.print("Enter the account number: ");
						long ac = sc.nextLong();
						
						Customer u1 = new Customer("OOPS","oopsbank.password");
						CurrentAccount a1 = new CurrentAccount(ac);
						
						System.out.print("Enter the amount you want to deposit: ");
						long amount = sc.nextLong();
						
						a1.deposit(ac, u1, amount);
						break;
					case "transfer":
						System.out.print("Do you want to transfer money to Current account?(y/n) ");
						char c = sc.next().charAt(0);
						
						if(c == 'y') {
						
							System.out.print("Enter the nominee account number: ");
							long nAccNum = sc.nextLong();
							
							Customer u2 = new Customer("OOPS","oopsbank.password");
							CurrentAccount a2 = new CurrentAccount(1234567890);				
							
							System.out.print("Enter the amount you want to transfer: ");
							long amt = 0;
							try {
								amt = sc.nextLong();
								CurrentAccount nominee = new CurrentAccount(nAccNum);
								a2.transfer(a2,nominee,u2,amt);
							}catch(Exception e) {
								System.out.println("Exception: "+e);
							}

							
							
						}
						else if(c == 'n') {
							
							System.out.print("Enter the nominee account number: ");
							long nAccNum = sc.nextLong();
							
							Customer u2 = new Customer("OOPS","oopsbank.password");
							CurrentAccount a2 = new CurrentAccount(1234567890);				
							
							System.out.print("Enter the amount you want to transfer: ");
							long amt = 0;
							try {
								amt = sc.nextLong();
								SavingsAccount nominee = new SavingsAccount(nAccNum);
								a2.transfer(a2,nominee,u2,amt);
							}catch(Exception e) {
								System.out.println("Exception: "+e);
							}

							
							
						}
						break;
					default:
							System.out.println("Enter the valid service!!!");
				}
				break;
				
			default: 
				System.out.println("Enter the valid account type!!!");
		}
		sc.close();
	}
}
