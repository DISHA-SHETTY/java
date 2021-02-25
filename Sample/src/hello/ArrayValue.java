package hello;

public class ArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,8,19,9,21};
		int n=21;
		for(int i=0;i<5;i++) {
			if(a[i]==n)
			{
				System.out.println(n+"Is present");
			}
			else {
				System.out.println("not present");
			}
		}

	}

}
