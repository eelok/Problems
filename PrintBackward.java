package Problems;

public class PrintBackward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBackward("Hello there!");

	}

	public static String printBackward(String anyString) {
		String newString = "";
		for (int i = anyString.length()-1; i >= 0; i--) {
			newString += anyString.charAt(i);
		}
		System.out.print(newString);
		return newString;
	}
}
