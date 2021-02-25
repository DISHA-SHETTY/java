package hello;

public class VoCo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int conscount=0;
		int vowcount=0;
		String str="bangalore";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowcount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				conscount++;
				
			}
		}
		System.out.println("Number of vowels "+vowcount);
		System.out.println("number of consonants "+conscount);

	}

}
