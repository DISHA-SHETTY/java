package hello;

public class StudentResult {

	public static void main(String[] args) {
		String name="disha";
		int regno = 43;
		int sub1 = 30;
		int sub2 = 20;
		int sub3 = 50;
		
		String result="";
		int total= sub1+sub2+sub3;
		float avg=total/3;
		
		if(sub1>=40 && sub2>=40&& sub3>=40) {
			result="pass";
			
		}
		else
			result="Fail";
		System.out.println(name+" " +regno+" "+total+" "+avg+" " +result+" ");
		
		
		

	}

}
