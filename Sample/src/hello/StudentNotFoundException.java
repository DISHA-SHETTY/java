package hello;

public class StudentNotFoundException extends Exception{
	public StudentNotFoundException() {
		super("student not found");
	}

}
