package Assignment4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Que2App {
	public static void main(String[] args) {
		try {
			FileInputStream fi= new FileInputStream("C:\\\\Users\\\\ve00ym231\\\\Documents\\\\Vineet.jpg");
			System.out.println(fi);
		    FileOutputStream output = new FileOutputStream("C:\\\\Users\\\\ve00ym231\\\\Documents\\\\Vineet2.jpg");
		   int asciiValue=0;
		  
			while((asciiValue=fi.read())!=-1) {
				System.out.println(asciiValue);
				output.write(asciiValue);
				   
			   }
			output.flush();
			output.close();
			output.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
