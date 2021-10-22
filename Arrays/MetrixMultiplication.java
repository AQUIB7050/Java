package arrays;

import java.util.Scanner;

public class MetrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter Number of Rows: ");
		int cols = sc.nextInt();
		
		int metrix1[][] = new int[rows][cols];
		int metrix2[][] = new int[rows][cols];
		
		
		System.out.println("Enter Values in Metrix1: ");
		
		
		for (int i=0; i<rows;i++) {
			
			for (int j=0; j<cols; j++) {
				metrix1[i][j] = sc.nextInt();
			}
			
		}
		
		
		System.out.println("Enter Values in Metrix2: ");
		
		for (int i=0; i<rows; i++) {
			
			for (int j=0; j<cols; j++) {
				metrix2[i][j] = sc.nextInt();
			}
			
		}
		

		
		
		int product[] = new int [rows];
		
		for (int i=0; i<rows; i++) {
			
			for (int j=0; j<cols; j++) {
				product[i] += (metrix1[i][j] * metrix2[j][i]);
			}
			
			System.out.print(product[i]);
		}
		
		

	}

}
