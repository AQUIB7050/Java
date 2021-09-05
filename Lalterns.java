import java.util.Arrays;
import java.util.Scanner;
 
public class Lalterns {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double l = sc.nextDouble();
		
		double a[] = new double[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextDouble();
		}
		
		Arrays.sort(a);
		double g = 2*a[0];
		
		for(int i=0; i<n-1; i++) {
				
			if(a[i+1] - a[i] > g) {
				g = a[i+1]-a[i];
			}
		}
		
		g = g/2;
			
		
		double s = l-a[n-1];
		
			if(s>g) {
				System.out.println(s);
			}else {
				System.out.println(g);
			}
		
	}
 
}
