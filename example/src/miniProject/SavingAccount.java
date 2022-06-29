package miniProject;

public class SavingAccount {
	double interest_rate;
	int current_balance;
	double interest;
	
	public SavingAccount(int curent_balance) {
		this.interest_rate = 0.05;
		this.interest = current_balance*interest_rate/12;
		this.current_balance = current_balance+(int)interest;
	}
	
	public double getInterest() {
		this.interest = current_balance*interest_rate/12;
		return interest;
	}
}
