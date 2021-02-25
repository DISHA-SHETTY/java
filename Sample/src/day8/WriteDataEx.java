package day8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\filesex");
		try {
			FileOutputStream fos =new FileOutputStream(file+"\\sample.txt");
			for (char c='A';c<='Z';c++)
				fos.write(c);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");

	}

}
