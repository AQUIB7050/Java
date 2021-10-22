package strings;

public class AnitherMethodforAnagram {

	public static void main(String[] args) {
		
		
//		String a = "listen7";
//		String b = "s7ilent";
//		boolean isAnagram = true;
//		
//		int al[] = new int[256];
//		int bl[] = new int[256];
//		
//		for (char c: a.toCharArray()) {
//			int index = (int) c;
//			al[index]++;
//		}
//		
//		for (char c: b.toCharArray()) {
//			int index = (int) c;
//			bl[index]++;
//		}
//		
//		for (int i=0; i<256; i++) {
//			if(al[i] != bl[i]) {
//				isAnagram = false;
//				break;
//			}
//		}
//		
//		
//		if(isAnagram) {
//			System.out.println("This is an Anagram");
//		} else {
//			System.out.println("This is Not an Anagram");
//		}
		
		
		
		// ANOTHER METHOD: - 
		
		String a = "listen7";
		String b = "s7ilent";
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for (char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		
		for (char c: b.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		
		for (int i=0; i<256; i++) {
			if(al[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		
		
		if(isAnagram) {
			System.out.println("This is an Anagram");
		} else {
			System.out.println("This is Not an Anagram");
		}

	}

}
