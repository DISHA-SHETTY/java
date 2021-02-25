package hello;
@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception{
	
	public AccountNotFoundException(){
		super("Account Not found");
	}

}
