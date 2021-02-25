package hello;

public class Employe {
	private int code;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String name;
	private double salary;
	public Employe() {
		
	}
	public Employe(int code,String name,double salary) {
		this.code=code;
		this.name=name;
		this.salary=salary;
	}

}
