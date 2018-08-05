package Problems;

public class IsVowel {

	public static void main(String[] args) {
		isVowel("bCdik");
		isVowel("bCdkz");
	}
	
	private static void isVowel(String anySting) {
		char[] vowelArray = {'A','a','E','e','I','i','O','o','U','u'};
			if(contain(vowelArray, anySting)) {
				System.out.printf("%s string contain vowel.\n", anySting);
			} else {
				System.out.printf("%s string NOt contain vowel.\n", anySting);
			}		
	}
	
	private static boolean contain(char[] vowelArray, String myString) {
		for(int i = 0; i < vowelArray.length; i++) {
			for(int j = 0;  j < myString.length(); j++) {
				if(vowelArray[i] == myString.charAt(j)) {
					return true;
				} 
			}
		}
		return false;
	}
}
