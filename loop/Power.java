package loop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number");
		int a = sc.nextInt();
		
		
		System.out.println("Enter The Power");
		int b = sc.nextInt();
		
		int product = 1;
		
		for ( int i=0; i<b; i++) {
			product *= a;
		}
		
		System.out.print(product);
		

	}

}
