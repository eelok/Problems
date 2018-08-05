package Problems;

public class ContainsTwice2 {

	public static void main(String[] args) {
		System.out.println(containsTwice2("Mariia", 'i'));
		System.out.println(containsTwice2("hello", 'l'));
		System.out.println(containsTwice2("Stul", 'i'));
		

	}
	private static boolean containsTwice2(String anyString, char anyChar) {
		int countCahr = 0;
		for(int i = 0; i < anyString.length(); i++) {
			if(anyString.charAt(i) == anyChar) {
				countCahr++;
				if(countCahr>1) {
					return true;
				}
			}
		}
		return false;
	}

}
