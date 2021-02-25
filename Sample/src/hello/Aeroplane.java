package hello;

public class Aeroplane implements Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles a=new Aeroplane();
		a.wheels();
		a.engines();

	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane has 2 wheels");
		
	}

	@Override
	public void engines() {
		System.out.println("Aeroplane has five engines");
		// TODO Auto-generated method stub
		
	}

}
