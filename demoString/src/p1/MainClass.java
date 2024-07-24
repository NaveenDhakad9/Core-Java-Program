package p1;

import java.util.Scanner;

public class MainClass extends Exception {
	public MainClass(String msg) {
		super(msg);
	}

	public static void main(String args[]) {
		// String literal process
		String s1 = "String Program";
		int len1 = s1.length();
		char ch1 = s1.charAt(5);

		System.out.println("S1 : " + s1);
		System.out.println("S1 length : " + len1);
		System.out.println("S1 char at " + ch1);

		try {
			// New operator
			String s2 = new String();
			System.out.println("Enter the String");
			Scanner sc = new Scanner(System.in);
			s2 = sc.nextLine();
			int len2 = s2.length();
			System.out.println("Enter the number below to " + len2 + " get char ");
			int l = sc.nextInt();
			if (l > len2) {
				MainClass mc = new MainClass("Invalid number");
				throw mc;
			} 
				char ch = s2.charAt(l);
				System.out.println("S2 : " + s2);
				System.out.println("S2 length : " + len2);
				System.out.println("S2 char at " + ch);
			sc.close();
		} catch (MainClass mc) {
			System.out.println(mc.getMessage());
		}
	}
}
