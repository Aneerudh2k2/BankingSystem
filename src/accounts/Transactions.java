package accounts;

public class Transactions {
	
	public synchronized void withdraw(long amt) {
		System.out.println("Withdraw is in process......");
		if(amt < Account.balance) {
			try {
				wait();
			} catch (InterruptedException e) {
				 e.printStackTrace();
			}	
			
			long bal = Account.balance - amt;
			System.out.println("Your balance after withdrawal "+bal);
			System.out.println("Successfully withdrawn....");
		}	
	}
	
	public synchronized void deposit(long amt) {
		System.out.println("Deposit is in process.....");
		
		Account.balance += amt;
		System.out.println("Your balance after deposit "+Account.balance);
		System.out.println("Successfully deposited....");
		notify();
	}
	
	
}

class T1 implements Runnable {
	Transactions ex;
	
	public T1(Transactions ex1) {
		this.ex = ex1;
		new Thread(this,"Withdraw").start();
	}
	@Override
	public void run() {
		ex.withdraw(12000);
	}
	
}

class T2 implements Runnable {
	Transactions ex;
	
	public T2(Transactions ex1) {
		this.ex = ex1;
		new Thread(this,"Deposit").start();
	}
	@Override
	public void run() {
		ex.deposit(12000);
	}
	
}
