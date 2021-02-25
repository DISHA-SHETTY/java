package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		
		ArrayList <String> list=new ArrayList<String>();
			list.add("Disha");
			list.add("Pooja");
			list.add("Akssh");
			list.add("ditt");
			list.add("dee");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name:");
			String c=sc.next();
			if(list.contains(c)) {
				System.out.println("Name is Present in the list");
			}
			else {
				System.out.println("Name is not present in the list");
			}
		// TODO Auto-generated method stub

	}

	}
