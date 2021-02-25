package hello;

public class TestInterface implements InterfaceOne,InterfaceTwo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestInterface one=new TestInterface();
one.methodOne();
one.methodTwo();
one.methodThree();


	}

	private void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("this is method three");
		
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("this is method two");
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("this is method one");
	}

}
