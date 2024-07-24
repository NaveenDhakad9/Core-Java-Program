package p1;

public class OuterClass {
	public int a=10;
	public static int b=20;
	public void sum()
	{
		System.out.println("OuterClass.sum()");
		System.out.println(a+b);
	}
	public static void sum1()
	{
		System.out.println("OuterClass.sum1()");
		System.out.println(b);
	}
    
	//Static inner class
	public static class InnerClass{
		public int c=20;
		public static int d=30;
		public void dis()
		{
			System.out.println("OuterClass.InnerClass.dis()");
			System.out.println("...."+b+","+c+","+d);
		}
		public static void dis1()
		{
			System.out.println("OuterClass.InnerClass.dis1()");
			System.out.println("..."+b+","+d);
		}
		
	}
}
