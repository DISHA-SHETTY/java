package hello;
public class Studentt {
	protected int regNo;
	protected String stdname;
	protected int sub1;
	protected int sub2;
	protected int sub3;
	protected int total;
	protected float avg;
	public Studentt(int regNo, String stdname, int sub1, int sub2, int sub3) {
		this.regNo=regNo;
		this.stdname=stdname;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		total=sub1+sub2+sub3;
		avg=(float)(total/3);
	}
	public void display() {
		System.out.println("RegNo "+regNo+" Name "+stdname+" Total "+total+" Average "+avg);
	}
	public void getResult() {
		
		if(avg>40)
			System.out.println(regNo+" Pass");
		else
			System.out.println(regNo+" Fail");
	}

}

