package day5;

import java.util.TreeSet;

public class EmpSort {

public static void main (String[] args) {
TreeSet<Employee> emplys = new TreeSet<>();
emplys.add(new Employee(201, "xyz" ,7000));
emplys.add(new Employee(101, "abc" ,5000));
emplys.add(new Employee(401, "ijk" ,8000));
for(Employee e : emplys) {
System.out.println(e.getCode()+e.getName()+e.getSalary());
}

}

}