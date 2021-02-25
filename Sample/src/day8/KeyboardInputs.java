package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyboardInputs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.println("Enter code name and salary");
		int code=Integer.parseInt(br.readLine());
		String name=br.readLine();
		double sal =Double.parseDouble(br.readLine());
		System.out.println(code+" "+name+" "+sal+" ");
		System.out.println("Enter the rno std name");
		Scanner sc= new Scanner(System.in);
		int rno=sc.nextInt();
		String name1=sc.next();
		System.out.println(code+" "+name+" ");
		
		
		
		

	}

}
