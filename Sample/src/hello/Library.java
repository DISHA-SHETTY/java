package hello;

public class Library extends Student{
	private int booksdue;
	Library(int regno,String stdname, int booksdue){
		super(regno,stdname);
		this.booksdue=booksdue;
	}
	void showBooks() {
		System.out.println("Booksdue: "+booksdue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lb=new Library(123,"cap",5);
		lb.display();
		lb.showBooks();

	}

}