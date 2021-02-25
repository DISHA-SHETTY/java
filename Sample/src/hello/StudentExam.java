package hello;





public class StudentExam extends Student {
	protected int sub1;
	protected int sub2;
	protected int sub3;
	public StudentExam(int regno, String stdname) {
		super(regno, stdname);
		sub1=50;
		sub2=90;
		sub3=20;
	}
	public void showResult() {
		int total=sub1+sub2+sub3;
		System.out.println(regno+" "+stdname+" "+total);
	}
	public void display() {
		//super.display();
		System.out.println("from sub class");
	}

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		StudentExam exam=new StudentExam();
		
		//exam.display();
		//exam.showResult();
		//Super class object
		Student std=new Student(10,"abcd");
		std.display();
		std=exam;
		std.display();
		StudentExam stdexam =new StudentExam();
		Student st =new Student(44,"dddd");
		stdexam=(StudentExam) st;
		stdexam.display();
		stdexam.showResult();

	}

}


