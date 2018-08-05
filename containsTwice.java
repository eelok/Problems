package Problems;

import sun.management.snmp.resources.snmpagent;

public class containsTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(containTwice("Marii"));
		

	}
	
	private static boolean containTwice(String anyString) {
		for (int i = 0; i < anyString.length()-1; i++) {
			char x = anyString.charAt(i);
			if(x == anyString.charAt(i+1)) {
				return true;
			}
		}
		return false;
	}

}
