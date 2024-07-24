package p2;

import java.util.Scanner;
import p1.EveryThingOfJava;
import static p1.EveryThingOfJava.*;

public class MainClass {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		EveryThingOfJava et = new EveryThingOfJava(30,40);
		System.out.println("Enter one number : ");
		int m = sc.nextInt();
		System.out.println("Enter second number : ");
		int n = sc.nextInt();
		System.out.println("Access static component : "+b);
		et.sum();
		sum1();
		System.out.println(et.sum(m, n));
		System.out.println("...........");
		et.i=sc.nextInt();
		k=sc.nextInt();
		l=sc.nextInt();
		et.set(45);
		System.out.println(et.get());
		
		sc.close();
		
		
		
	}

}
