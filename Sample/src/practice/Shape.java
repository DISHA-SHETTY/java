package practice;

public abstract class Shape {
	protected int length;
	protected int breadth;
	protected int radius;
	Shape(int radius){
		this.radius=radius;
		
	}
	Shape(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	abstract void CalculateArea(); 
	
	

}
