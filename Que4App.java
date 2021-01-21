package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Que4App {
	public static void main(String[] args)  {
		Scanner obj = new Scanner(System.in);
		int input;
		while (true) {
			System.out.println("Enter a number or -1 to quit");
			try {
				input = obj.nextInt();
				if (input == -1) {
					System.out.println("TERMINATED");
					break;
				}
				else {
					if (input % 2 == 0) {
						System.out.println("Even Number");
					} else {
						System.out.println("Odd Number");
					}
				}
			}
			catch (InputMismatchException ex) {
				System.out.println("Please enter only integer");
		
			}
		
	
			

		}
		

	}

}
