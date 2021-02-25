package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\filesex");
		file.mkdir();
		try {
			FileInputStream fos =new FileInputStream(file+"\\sample.txt");
			FileOutputStream fis =new FileOutputStream(file+"\\copied.txt");
			int m;
			while ((m=fos.read())!=-1)
				fis.write((char)m);
		
			fos.close();
			fis.close();
			System.out.println("copied");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
