package conditionalStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		
		int dayOfWeek = 4;
		
		switch(dayOfWeek) {
		
		case 1:
			System.out.println("I am on leave");
			break;
		
		case 2:
			System.out.println("I am Playing Football Today");
			break;
			
		case 3:
			System.out.println("Sleeping All Day");
			break;
			
		default:
			System.out.println("Cricket Day");
		}

	}

}
