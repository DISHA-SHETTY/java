package hello;

public class UserDefinedExceptionExample {
	public static void main(String[] args) {
		int rno=123;
		try {
			if(rno!=123)
				throw new StudentNotFoundException();
			System.out.println("Student details are "+rno+" name is capgemini ");
		}
	}

}
