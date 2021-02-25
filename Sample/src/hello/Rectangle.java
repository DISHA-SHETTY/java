package hello;



public class Rectangle extends Shape {
	Rectangle(int len,int breadth){
		super(len,breadth);
	}

	public static void main(String[] args) {
		
		Shape s=new Rectangle(8,7);
		s.calculateArea();
	}

	
	void calculateArea() {
		
		System.out.println("Area of Rectangle is "+(len*breadth));
	}

}
