package whileLoops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int n = 1;
		
		
		do {
			
			n = sc.nextInt();
			
			System.out.println("The Number Is " + n);
			
		} while (n!=0);

	}

}
