package hello;

public class CommandLine {

	public static void main(String[] args) {
		int code=Integer.parseInt(args[0]);
		String name =args[1];
		double salary=Double.parseDouble(args[2]);
		System.out.println(code+" "+name+" "+salary+" ");

	}

}
