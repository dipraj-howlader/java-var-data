package JavaPhase;

import java.util.Scanner;

public class OperatorAndExpre {
	public static void main(String[] args) {
		System.out.println("Enter first number:\n");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		System.out.println("Enter second number:\n");
		Scanner inp  = new Scanner(System.in);
		int num2 = inp.nextInt();
		int sum = num1 + num2;
		int Sub  = num1 - num2;
		int Mul = num1 * num2;
		float div = (float) num1 / num2;
		System.out.println("Sum IS :"+ sum);
		System.out.println("Sub IS :"+ Sub);
		System.out.println("Mul IS :" + Mul);
		System.out.println("Div IS :" + div);
		
		
		//Assignment operator
		
		int x = 5;
		int y = 6; 
		// x = x+y
		x+=y;
		System.out.println("Sum of :\n" + x);
		
		x-=y;
		System.out.println("Sum of :\n" + x);
		x*=y;
		System.out.println("Sum of :\n" + x);
		x/=y;
		System.out.println("Sum of :\n" + x);
		x%=y;
		System.out.println("Sum of :\n" + x);
		
		
	}
}
