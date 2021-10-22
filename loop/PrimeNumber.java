package loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		// IF A NUMBER IS PRIME THEN THERE WILL EXIST A FACTOR BETWEEN 1 AND ROOT N
		// FOR SAVING TIME, WE CAN DO -> FOR (INT I =2; I*I <=N, I++)
		
		for (int i =2; i<n; i++) {
			
			if(n % i == 0) {
				isPrime = false;
				break;
			} 
		}
		
		if (n<2) isPrime = false;
		
		System.out.println(isPrime);

	}

}
