package day4;

public class Student {
	int regNo;
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	private String stdname;
	private int sub1;
	private int sub2;
	private int sub3;

	public Student(int regNo, String stdname, int sub1, int sub2, int sub3) {
		this.regNo=regNo;
		this.stdname=stdname;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}

	public int getTotal1() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
	