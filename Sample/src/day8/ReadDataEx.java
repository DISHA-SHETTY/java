package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\filesex");
		try {
			FileInputStream fis=new FileInputStream(file+"\\sample.txt");
			int c;
			while((c=fis.read())!=-1)
				System.out.println((char) c);
			fis.close();
				
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
