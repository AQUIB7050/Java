package loop;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			
			for (int k=1; k<=(i-1); k++) {
				System.out.print("  ");
			}
			for (int j=n; j>=i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
