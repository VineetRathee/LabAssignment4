package Assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que1App {
	public static void main(String[] args) {
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ve00ym231\\Documents\\demo.txt"));
			System.out.println("Enter some lines you want to write in file ");
			BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			bw.write(obj.readLine());
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Some error is present ");
		}
		System.out.println("Written into file successfully");
	}
		
	}


