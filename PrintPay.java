package Problems;

public class PrintPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPay(10.00, 11);

	}
	
	static private void printPay(double salaryPerHour, int amounthOfours) {
		double salary;
		if(amounthOfours > 8) {
			int overtime = amounthOfours - 8;
			double overtimeSalary = (overtime * salaryPerHour) + (overtime* salaryPerHour)/2;
			salary = (8 * salaryPerHour) + overtimeSalary;
			System.out.println(salary);
			
		} else {
			System.out.println(salaryPerHour * amounthOfours);
		}
		
	}

}
