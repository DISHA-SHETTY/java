package day5;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int diff=(int) (o1.getSalary()-o2.getSalary());
		return diff;
	}

}