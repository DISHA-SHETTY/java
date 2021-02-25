package practice;

public class Circle extends Shape{
	Circle(int radius){
		super( radius);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle(10);
		s.CalculateArea();
		

	}


	@Override
	void CalculateArea() {
		// TODO Auto-generated method stub
		System.out.println("area of the circle:"+(3.14*radius*radius));
		
	}

}
