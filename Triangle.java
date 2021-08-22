package JavaPhase;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner first = new Scanner(System.in);
		Scanner sec = new Scanner(System.in);
		
		System.out.println("----Triangle Area-----\n\n");
		System.out.println("Enter Height\n");
		int height = first.nextInt();
		System.out.println("Enter Base\n");
		int base = sec.nextInt();
		
		float area = (float) (0.5 * height * base);
		
		System.out.println("Total Area is :" + area);
;
		}
}
