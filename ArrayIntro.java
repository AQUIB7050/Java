package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		
//		MULTIPLE WAYS OF ASSIGNING AN ARRAY
		
//		int[] marks = new int[10];
		
//		int[] marks;
//		marks = new int[10];
		
//		

		
		// WE CAN ALSO ASSIGN DIRECTLY
		
		int age[] = {2,5,1,34,12};
		
//		double marks[] = {2.4,3.0,2.1,7.2};
//		
//		//TO UPDATE
//		
//		age[0] = 10;
//		
//		System.out.println("For age " + age[0] + " Marks is " + marks[0]);
		
		//using loop
		
		for (int i=0; i<age.length; i++) {
			System.out.println(age[i]);
		}

	}

}
