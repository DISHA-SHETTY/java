package hello;

public class Bike implements Vehicles{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.wheels();
		b.engines();

	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("Bike has two wheels");
		
	}

	@Override
	public void engines() {
		// TODO Auto-generated method stub
		System.out.println("Bike has one engine");
	}

}
