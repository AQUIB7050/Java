package loop;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The Number: ");
			int n = sc.nextInt();
			
			int rows = 2*n-1;
			
			for (int i=1; i<=rows; i++) {
				
			if (i<=n) {
				for(int k=1; k<=(n-i); k++) {
					System.out.print("  ");
					} 
				
			    for (int l=1; l<=i; l++) {
			    	System.out.print("* ");
			    }
			    System.out.println();
			}
			
			else {
					for(int j=1; j<=(i-n); j++) {
						System.out.print("  ");
					}
					
					for (int m=1; m<=2*n-i; m++) {
				    	System.out.print("* ");
				    }
				System.out.println();
				}
				
				
			}

	}

}
