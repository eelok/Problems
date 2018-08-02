package Problems;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triange(5);

	}
	public static void triange(int heigth) {
		for (int j = 1; j <= heigth; j++) {
			for(int i = 1; i<= heigth-j; i++) {
				System.out.print(" ");
			}
			for(int z = 0; z < j; z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
