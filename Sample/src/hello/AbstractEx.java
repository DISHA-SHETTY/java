package hello;

public class AbstractEx extends Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new AbstractEx();
		s.display();
		s.show();

	}
	void show() {
		System.out.println("this is an abstract method");
	}

}
