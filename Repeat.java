package Problems;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repeat("Lapscha", 5);

	}
	public static String repeat(String anyString, int num) {
		int i = 1;
		String allStrings = " ";
		if(num > 0) {
			while( i <= num) {
				allStrings += anyString;
				i++;
			}
			System.out.print(allStrings);
			return allStrings;
		} else {
			anyString  = "";
		}
		System.out.print(anyString);
		return anyString;
	}
}
