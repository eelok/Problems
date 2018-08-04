package Problems;

public class Stutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("hello");
	}
	static public void print(String anyString) {
		String newString = "";
		for (int i = 0; i < anyString.length(); i++) {
			newString += anyString.charAt(i) + anyString.substring(i, i+1);
		}
		System.out.println(newString);
	}
}
