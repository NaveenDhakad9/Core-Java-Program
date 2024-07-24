package p1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Mainclass extends Exception {
	
	public Mainclass(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter a number between 0 to 10:");
			int n = sc.nextInt();
			if(n>0 || n<10)
			{
				Mainclass mc = new Mainclass("Invaild number ,Please enter number between 0 to 10");
				throw mc;
			}
			
			System.out.println(n+" Vaild number");
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please Enter integer value");
		}
		catch(InputMismatchException i)
		{
		    System.out.println("Enter integer value");	
		}
		catch(Mainclass mc)
		{
			System.out.println(mc.getMessage());	
		} 
		
		finally {
			sc.close();
		}
	}
 
}
