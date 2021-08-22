package JavaPhase;

import java.util.Scanner;

public class GetInput {
	public static void main(String[] args) {
		System.out.println("Hello Java Developers\n");
		//Take Input from Brother
//		 1. Have to import scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		 int number;
		number = input.nextInt();
		
		System.out.println("This is my gf number: " + number);
		
		//using string type
		System.out.println("Printing My Name\n");
		String myName;
		Scanner stringInpu = new Scanner(System.in);
		myName = stringInpu.next();
		System.out.println("HYE My Name is : " + myName);
		
		

		 
	}

}
