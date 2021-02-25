package hello;

public class Searching {

	public static void main(String[] args) {
		String[] words= {"hi","am","disha"};
		String str="am";
		int flag=0;
		int pos=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(str)) {
				flag=1;
				pos=i;
				
			}
		}
			if(flag==1)
				System.out.println("The word is at location"+(pos+1));
			else
				System.out.println("not found");
		}
			
		}
		

