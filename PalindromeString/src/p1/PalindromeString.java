package p1;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1;
		String s2 = "";
		System.out.print("Enter a String : ");
		s1 = sc.nextLine();
		int len = s1.length();
		for (int i = 0; i < len; i++) {
			char c = s1.charAt(len -i-1);
			s2 = s2 + c;
		}

		if (s1.equals(s2)) {
			System.out.println("String is Palindrome.");
		} else {
			System.out.println("String is not Palindrome.");
		}
		sc.close();

	}

}
