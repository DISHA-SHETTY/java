package day8;

public class Demo {

public static class SingletonPatternDemo {
	 

		 public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 //Singleton obj = new Singleton(); -> error
			 EmployeeClassEx obj = EmployeeClassEx.getInstance();
		 obj.showMessage();
		 obj.setCode(456);
		 obj.setName("Disha");
		 obj.setSalary(8907);
		 
		 System.out.println(obj.getCode());
		 System.out.println(obj.getName());
		 System.out.println(obj.getSalary());
		  
		 }

		 }


}
