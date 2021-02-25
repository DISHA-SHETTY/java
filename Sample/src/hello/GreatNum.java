package hello;

public class GreatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,8,19,9,21};
		int max=a[0];
		for(int i=1;i<5;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
	}
		System.out.println("Greatest of five numbers is"+max);

}
}
	
