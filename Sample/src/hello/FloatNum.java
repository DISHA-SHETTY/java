package hello;

public class FloatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=1100000;
		if (num>0)
		{
			if(num<1) {
				System.out.println("Positive Small");
			}
			else if(num>1000000)
			{
				System.out.println("positive large");
			}
			else
			{
				System.out.println("Positive");
			}
		}
		else if(num<0)
		{
			System.out.println("negative");
			
		}
		else
		{
			System.out.println("Zero");
		}
		}

	}


