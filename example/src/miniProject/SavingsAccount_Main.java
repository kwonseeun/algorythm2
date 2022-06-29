package miniProject;

public class SavingsAccount_Main{

	 public static void main(String[] args) {
	  
	  SavingsAccount balance1 = new SavingsAccount (10000);
	  SavingsAccount balance2 = new SavingsAccount (20000);
	  
	  System.out.println("★첫 달 - 연이율 : 0.05");
	  System.out.println("첫 번째 계좌 이자 : "+(int)balance1.getInterest()+"원");
	  System.out.println("두 번째 계좌 이자 : "+(int)balance2.getInterest()+"원");
	  
	  balance1.setInterest_rate(0.06); 
	  balance2.setInterest_rate(0.06);
	  System.out.println("\n★두 번째 달 - 연이율 : 0.06");
	  System.out.println("첫 번째 계좌 이자 : "+(int)balance1.getInterest()+"원");
	  System.out.println("두 번째 계좌 이자 : "+(int)balance2.getInterest()+"원");
	  
	  System.out.println("\n★첫 번째 계좌 총 잔액 : "+balance1.getCurrent_balance()+"원");
	  System.out.println("★두 번째 계좌 총 잔액 : "+balance2.getCurrent_balance()+"원");
	 }
	}