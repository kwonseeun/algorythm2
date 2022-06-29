package miniProject;

public class SavingAccount_Main {

	public static void main(String[] args) {
		
		SavingAccount balance1 = new SavingAccount(10000);
		SavingAccount balance2 = new SavingAccount (20000);
		
		System.out.println("첫 달 연이율: 0.05");
		System.out.println("첫 번째 계좌 이자:" + (int) balance1.getInterest()+"");
		System.out.println("두 번째 계좌 이자:" + (int) balance1.getInterest()+"");
		
		balance1.setInterest_rate(0.06);
		balance2.setInterest_rate(0.06);

		System.out.println("두 번째 달 연이율: 0.06");
		System.out.println("\n★두 번째 달 - 연이율 : 0.06");
		  System.out.println("첫 번째 계좌 이자 : "+(int)balance1.getInterest()+"원");
		  System.out.println("두 번째 계좌 이자 : "+(int)balance2.getInterest()+"원");
		  
		  System.out.println("\n★첫 번째 계좌 총 잔액 : "+balance1.getCurrent_balance()+"원");
		  System.out.println("★두 번째 계좌 총 잔액 : "+balance2.getCurrent_balance()+"원");
	}
}
