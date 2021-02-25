package day8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectForFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("C:\\filesex\\cardinto.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			CardDetails card1=new CardDetails(123456789123456L,"Capgemini",10,22,34);
			CardDetails card2=new CardDetails(12345678912377756L,"Cap",10,22,34);
			oos.writeObject(card1);
			oos.writeObject(card2);
			oos.close();
			fos.close();
			System.out.println("created");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
