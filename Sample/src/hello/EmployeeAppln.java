package hello;

public class EmployeeAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee= new Employee();
		employee.setEmpcode(43);
		employee.setEmpname("Disha");
		employee.setBasicsal(3000);
		System.out.println(employee.getEmpcode()+" "+employee.getEmpname()+" "+employee.getBasicsal()+" ");

	}

}
