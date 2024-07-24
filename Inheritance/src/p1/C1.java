package p1;

public class C1 {
	
	public int a ;
	public static int b;
	public void dis()
	{
		System.out.println("Parent Display Method ");
		System.out.println("...."+a+","+b);
	}
	
	public static void dis2()
	{
		System.out.println("Static method of parent class");
		System.out.println("..."+b);
	}

}
