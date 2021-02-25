package hello;

public abstract class Shape {
	protected int rad;
	protected int len;;
	protected int breadth;
	Shape(int rad){
		this.rad=rad;
		
	}
	Shape(int len, int breadth){
		this.len=len;
		this.breadth=breadth;
	}
	abstract void calculateArea();

}