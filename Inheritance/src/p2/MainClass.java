package p2;

import java.util.Scanner;

import p1.C2;

public class MainClass {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		C2 c= new C2();
		System.out.println("Enter a number");
		c.a=sc.nextInt();
		System.out.println("Enter a number");
		C2.b=sc.nextInt();
		c.dis();
		C2.dis2();
		c.dis3();
		C2.dis4();
	    
		sc.close();
	}
}
