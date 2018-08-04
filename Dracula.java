package Problems;

public class Dracula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dracula";
		for(int i = 0; i < s.length(); i++) {
			char a = s.charAt(0);
			String b = s.substring(1);
			s = b + a;
			System.out.println(s);
		}
		
	}
	

}
