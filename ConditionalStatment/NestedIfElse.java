package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 30;
		
		int result = 0;
		
		if (a > b) {
			if (a > c) {
				result = a;
			} else {
				result = c;
			}
		} else {
			if (b > c) {
				result = b;
			} else {
				result = c;
			}
		}
		
		
		System.out.println("largest of three numbers is " + result);
		
//		IN TERNARY OPERATOR
		
//		result = a>b ? a>c ? a : c : b>c ? c;

	}

}
