package assignment;

import java.io.IOException;
import java.util.Scanner;


class DrashtiException extends Exception{
	
	double amount;
	public DrashtiException(double amount) {
		this.amount=amount;
	}
}
class ATM{
	double balance;
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+ "rs deposited");
	}

	public void withdraw(double amount)throws DrashtiException,IOException,InterruptedException{
		if(amount<balance) {
			System.out.println("you have withdraw"+amount+ "rs");
			balance=amount;
			System.out.println("your remainig balance is..."+balance);
		}else {
			double needs;
			needs=amount-balance;
			throw new DrashtiException(needs);
		}
	}
	
}

public class UserDefineAssignmentQue {
	public static void main(String[] args) {
		ATM atm=new ATM();
		Scanner sc=new Scanner(System.in);
		double amount;
		System.out.println("enter the amount balance");
		amount=sc.nextDouble();
		atm.deposit(amount);
		
		System.out.println("enter the amount to be withdrawn");
		amount=sc.nextDouble();
		
		try {
			atm.withdraw(amount);
		} catch (DrashtiException e) {
			System.out.println("sorry"+e.amount+"you need more"+amount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
