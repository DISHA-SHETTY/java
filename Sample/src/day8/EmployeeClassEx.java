package day8;

public class EmployeeClassEx {

		private int code;
		private String name;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		private double salary;
		private static EmployeeClassEx instance = new EmployeeClassEx();
		private EmployeeClassEx() {
		}

		public static EmployeeClassEx getInstance() {
		return instance;

		}
		    public void showMessage() {
		    System.out.println("Hi!!!");
		    }
		   
		    public void setCode(int code) {
		     this.code = code;
		    }
		    public int getCode() {
		    return code;
		    }
		}

