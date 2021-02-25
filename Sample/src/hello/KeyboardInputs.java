package hello;

import java.util.Scanner;

public class KeyboardInputs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter accountnumber balance withdraw/deposit");
		int accountnumber=sc.nextInt();
		double balance=sc.nextDouble();
		String name=sc.next();
		System.out.println(accountnumber+" "+balance+" "+name+" ");
		// TODO Auto-generated method stub

	}

}
