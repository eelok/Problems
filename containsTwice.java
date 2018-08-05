package Problems;


public class containsTwice {

	public static void main(String[] args) {
		
		System.out.println(containTwice("Hello"));
		

	}
	
	private static boolean containTwice(String anyString) {
		for (int i = 0; i < anyString.length()-1; i++) {
			char x = anyString.charAt(i);
			if(x == anyString.charAt(i+1)) {
				return true;
			}
		}
		return false;
	}
}
