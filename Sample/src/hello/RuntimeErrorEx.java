package hello;

public class RuntimeErrorEx {

	public static void main(String[] args) {
		int x=7;
		int y=2;
		int a[]= {1,2,3,4,5};
		try {
			
			System.out.println("elements= "+a[30]);
			int z=x/y;
			System.out.println("result= "+z);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("success");
		// TODO Auto-generated method stub

	}

}
