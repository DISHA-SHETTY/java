package day5;



import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeListt {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
					// TODO Auto-generated method stub
					ArrayList<Employee> emplist=new ArrayList<>();
					emplist.add(new Employee(87,"disha",5490));
					emplist.add(new Employee(45,"shetty",2389));
					emplist.add(new Employee(809,"ddd",9000));
					emplist.add(new Employee(909,"pooja",7800));
					//emplist.forEach((e)->
					             //System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));//see that round bracket twice arnd foreach((e...
					@SuppressWarnings("resource")
					Scanner scl=new Scanner(System.in);
					System.err.println("enter the type of sorting: ");
					String type=scl.next();
					switch(type) {
					case "code":
					    emplist.sort((Employee o1,Employee o2)->o1.getCode()-o2.getCode());
					    emplist.forEach((e)->
			            System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
					    break;
					case "salary":
					    emplist.sort((Employee o1,Employee o2)->(int) (o1.getSalary()-o2.getSalary()));
				        emplist.forEach((e)->
			            System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
				        break;
					case "name":
					emplist.sort((Employee o1,Employee o2)->(o1.getName().compareTo(o2.getName())));
					emplist.forEach((e)->
			       System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
					break;
					
					}	
					

		}

	}