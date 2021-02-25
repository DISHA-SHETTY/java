package hello;

public class AccountAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setAcno(12345);
		account.setName("capgemini");
		account.setSalary(6000);
		System.out.println(account.getAcno()+" "+account.getName());
		System.out.println(account.getSalary());

	}

}
