package day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date dt= new Date();
		System.out.println("current date "+dt);
		String dob="25-02-2021";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date db=sdf.parse(dob);
		System.out.println("DOB "+db);
		
		String str="2020-11-25";
		LocalDate strdate=LocalDate.parse(str);
		System.out.println(strdate);
		
	}

}
