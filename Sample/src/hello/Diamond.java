package hello;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4;
		for (int i=1;i<=rows;i++) {
			for (int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=rows-1;i>0;i--) {
			for (int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1;j++) {
				System.out.print(" ");;
			}
			System.out.println();
			}
		}

	}


