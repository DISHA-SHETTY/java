package day8;

public class SingletonPatternDemo {
	 

		 public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 //Singleton obj = new Singleton(); -> error
		 SingleObject obj = SingleObject.getInstance();
		 obj.showMessage();
		 obj.setCode(456);
		 System.out.println(obj.getCode());
		  
		 }

		 }

