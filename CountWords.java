package Problems;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countWords("Hey what is your name?"));
	}
	private static int countWords(String anyString) {
		char empty = ' ';
		int countW = 0;
		for(int i = 0; i < anyString.length(); i++) {
			if( anyString.charAt(i) == empty) {
				 countW++;
			}
		}
		return countW;
	}
}
