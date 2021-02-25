package hello;


import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApplnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employe> empList=new ArrayList<>();
		empList.add(new Employe(102,"disha",9000));
		empList.add(new Employe(104,"shetty",1000));
		for(Employe emp : empList)
			System.out.println(emp.getCode()+" "+emp.getName()+" "+emp.getSalary());
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for(int i =0;i<3;i++) {
			System.out.println("Enter details of employee");
			int empcode=sc.nextInt();
			String name=sc.next();
			double salary=sc.nextDouble();
			empList.add(new Employe(empcode,name,salary));
		}
		for(Employe emp : empList)
			System.out.println(emp.getCode()+" "+emp.getName()+" "+emp.getSalary());
	}

}
