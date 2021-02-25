package hello;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String str="one good day";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
				
			}
		}
		System.out.println(count+1);

	}

}
