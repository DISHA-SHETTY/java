package hello;

public class Student {
	protected int regno;
	protected String stdname;
	public int regNo;
	Student(int regno, String stdname){
		this.regno=regno;
		this.stdname=stdname;
	}
	public void display() {
		System.out.println("Register No.: "+regno+"\nName: "+stdname);
	}
	public void getResult() {
		// TODO Auto-generated method stub
		
	}
}

