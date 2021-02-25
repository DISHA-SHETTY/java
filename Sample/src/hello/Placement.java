package hello;

public class Placement extends StudentExam{
	private int res;
	private int attended;
	private boolean selected;
	Placement(int regno,String stdname,int attended,boolean selected){
		super(regno,stdname);
		res=(sub1+sub2+sub3)/3;
		this.attended=attended;
		this.selected=selected;
	}
	void displayp() {
		System.out.println("Aggregate :"+res);
		System.out.println("Attended: "+attended+"\nSelected: "+selected);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Placement pc=new Placement(123,"cap",50,true);
		//pc.display();
		pc.showResult();
		pc.displayp();

	}

}