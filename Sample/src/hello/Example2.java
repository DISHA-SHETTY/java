package hello;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=args[0];
		StringBuffer sb= new StringBuffer(str);
		
		System.out.println("reverse "+sb.reverse());
		String data=sb.toString();
		if(str.equals(data)) {
			System.out.println("palindrome");
		}
			else
			{
				System.out.println("Not a palindrome");
		}
		
		

	}

}
