package strings;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
//		String myString = "I Love Java, the coffee";
//		myString.trim();
//		String allString[] = myString.split(" ");
//		int length = allString.length;
//		
//		for (int i = length-1; i>=0; i--) {
//			System.out.print(allString[i] + " ");
//			}
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String ans = "";
		int i = s.length()-1;
		
		while(i>=0) {
			
			while(i>=0 && s.charAt(i) == ' ') i--;
			
			int j = i;
			
			if(i<0) break;
			
			while(i>=0 && s.charAt(i) != ' ') i--;
			
			if(ans.isEmpty()) {
			    ans = ans.concat(s.substring(i+1, j+1));
			} else {
				ans = ans.concat(" " + s.substring(i+1, j+1));
			}
			
			
			}
		System.out.println(ans);
	}

}
