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
	public double getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(double interest_rate) {
		this.interest = current_balance*interest_rate/12;
		this.interest_rate = interest_rate;
		this.current_balance += interest;
	}
	public int getCurrent_balance() {
		return current_balance;
	}
	public void setCurrent_balance(int current_balance) {
		this.current_balance = current_balance;
	}
}
