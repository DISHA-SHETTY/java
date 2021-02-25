package hello;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int n1=0;
		int n2=1;
		System.out.println("Upto "+n+":");
		while(n1<=n)
		{
			System.out.println(n1+" ");
			int sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		

	}

}
