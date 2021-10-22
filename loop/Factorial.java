package loop;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int i = sc.nextInt();
		
		int j =1, product =1;
		
		
		   for(j=1; j<i; j++) {
			  product = product * j;
		    }
		
		   int factorial = product * i;
		
		
		System.out.println(factorial);
	}

}
