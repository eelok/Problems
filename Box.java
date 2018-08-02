package Problems;

public class Box {

	public static void main(String[] args) {
		printBox(5, 5);
	}
	
	private static void printBox(int width, int heigth) {
		for(int row = 1; row <= heigth; row++) {		
			boolean empty = !(row == 1 || row == heigth);
			printRow(width, empty);
		}
	}

	private static void printRow(int width, boolean empty) {
		System.out.print("*");
		
		for (int i = 1; i < width; i++) {
			System.out.print(empty ? " " : "*");
		}
		
		System.out.print("*");
		System.out.println(" ");
	}

}
