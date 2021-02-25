package hello;

public class Bus implements Vehicles{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus=new Bus();
		bus.wheels();
		bus.engines();

	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("Bus has 4 wheels");
		
	}

	@Override
	public void engines() {
		// TODO Auto-generated method stub
		System.out.println("Bus has one engines ");
		
	}

}


