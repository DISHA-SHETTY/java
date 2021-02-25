package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\filesex");
		file.mkdir();
		int v=0;
		int c=0;
		try {
			FileInputStream fos =new FileInputStream(file+"\\sample.txt");
			int m;
			while ((m=fos.read())!=-1)
				if(m=='A'||m=='E'||m=='I'||m=='O'||m=='U') {
					v++;
				}
				else {
					c++;
				}
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("number of vowels is "+v);
		System.out.println("Number of consonants is "+c);


	}

}
