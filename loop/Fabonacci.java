package loop;
import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number of Fabonacci Series You Want ");
		int n = sc.nextInt();
		
		int a =0, b = 1;
		
//		PRINTLN ADDS A NEW LINE SO IF WE DONT WANT NEW LINE WE CAN USE PRINT
		
		System.out.print(a+" ");
		System.out.print(b+" "); 
		
		for(int i = 0; i<n-2; i++) {
			
			int c = a + b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
