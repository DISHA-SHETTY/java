package practice;

public class Rectangle extends Shape {
	Rectangle(int length,int breadth){
		super(length,breadth);
		
	}

	public static void main(String[] args) {
		Shape s=new Rectangle(8,9); 
		s.CalculateArea();
		// TODO Auto-generated method stub

	}

	@Override
	void CalculateArea() {
		System.out.println("area of rectangle is:"+(length*breadth));
		// TODO Auto-generated method stub
		
	}

}
