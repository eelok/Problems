package Problems;

public class boxOfStars {

	public static void main(String[] args) {
		printBox


	}
	
	static void printBox(int width, int heigth) {
		for (int i = 1; i <= heigth; i++) {
			if(i == 1 || i == heigth) {
				printRow(width);
			}
			System.out.println("*");
		}
		System.out.println(" ");
	}


	private void printRow(int width) {
		for(int i = 1; i < width; i++) {
			System.out.print('*');
		}
	}
}
