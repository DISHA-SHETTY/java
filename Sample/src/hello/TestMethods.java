package hello;

public class TestMethods {


		// TODO Auto-generated method stub
		void add(int x,int y) {
			System.out.println("int ="+(x+y));
			
		}
		void add(double x,double y) {
			System.out.println("double ="+(x+y));
			
		}
		void add(String x,String y) {
			System.out.println("string ="+(x+y));
			
		}
		void add(long x,long y) {
			System.out.println("long ="+(x+y));
			
		}
		void add(float x,float y) {
			System.out.println("float ="+(x+y));
			
		}
		void add(char x,char y) {
			System.out.println("char ="+(x+y));
			
		}
		public static void main(String[] args) {
			TestMethods test =new TestMethods();
			test.add('a', 'b');
			test.add(10, 5);
			
			System.out.println();
			


	}

}
