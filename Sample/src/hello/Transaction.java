package hello;

import java.util.Scanner;
@SuppressWarnings("resource")
public class Transaction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=10000;
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the account number, amount, type ");
		int accountNo=sc.nextInt();
		double amount=sc.nextDouble();
		String tranType=sc.next();
		try {
		if(accountNo==4444) {
		if(tranType.equals("deposit"))
			System.out.println("Account No "+accountNo+"\nBalance "+(balance+amount));
		else if(tranType.equals("withdraw")){
			try {
				if(balance>amount) 
					System.out.println("Transaction completed\n Remaining balance is "+(balance-amount));
				else
					throw new InsufficientBalanceException();
		}
			catch(InsufficientBalanceException e) {
			e.printStackTrace();
		}
		}
		}
		else 
			throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e) {
			e.printStackTrace();
		}

	}
}

