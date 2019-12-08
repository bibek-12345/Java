package balance;
import java.util.Scanner;
public class Account {
	int curBalance,amt;
	Account()
	{
		curBalance=500;
	}
	public void deposit() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount\n");
		amt=s.nextInt();
		curBalance+=amt;
		System.out.println("the current balance is "+curBalance);
	}
	public void withdraw() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount ");
		amt=s.nextInt();
		try {
		if(curBalance-amt<500)
			throw new LessBalanceException(amt);
		curBalance-=amt;
		System.out.println("the balance left is "+curBalance);
		}
		catch(LessBalanceException e) {
			System.out.println(e);
		}
	}
	public void display_amt() {
		System.out.println("the current balance is "+curBalance);
	}
	class LessBalanceException extends Exception{
		int amt;
		LessBalanceException(int x) {
			System.out.println("balance is less:"+amt);
		}
	}
}

