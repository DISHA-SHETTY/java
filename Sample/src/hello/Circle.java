package hello;

public class Circle extends Shape{
	Circle(int rad){
		super(rad);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle(10);
		s.calculateArea();

	}

	
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle  "+(3.14*rad*rad));
	}

}