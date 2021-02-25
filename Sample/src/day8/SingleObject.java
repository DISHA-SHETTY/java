package day8;

public class SingleObject {
	private int code;
	private static SingleObject instance = new SingleObject();
	private SingleObject() {
	}

	public static SingleObject getInstance() {
	return instance;

	}
	    public void showMessage() {
	    System.out.println("Hello!!!");
	    }
	   
	    public void setCode(int code) {
	     this.code = code;
	    }
	    public int getCode() {
	    return code;
	    }
	}



