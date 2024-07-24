package p2;

import java.util.Scanner;

import p1.Student;

public class MainClass {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("rollnumber are 111,222,333");
			int rollnumber = sc.nextInt();
			Student s = new Student("");
			s.check(rollnumber);
			
			System.out.println("rollnumber verified");
		}
		catch(Student s)
		{
			System.out.println(s.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
