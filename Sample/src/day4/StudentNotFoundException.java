package day4;


@SuppressWarnings("serial")
public class StudentNotFoundException extends Exception{
	public StudentNotFoundException() {
		super("student not found");
	}

}
