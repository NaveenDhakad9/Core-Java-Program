package p1;

public class PrivateClass {

	private int a=10;
	private static int b=20;
	private PrivateClass()
	{
		System.out.println("PrivateClass.PrivateClass()");
	}
	
	private void m1()
	{
		System.out.println("PrivateClass.m1()");
		System.out.println(" a = "+a);
		System.out.println("b = "+b);
	}
	
	private static void m2()
	{
		System.out.println("PrivateClass.Static.m2()");
		System.out.println("b = "+b);
	}
	
	private class innerClass{
		public void m3()
		{
			System.out.println("PrivateClass.innerClass.m3()");
			System.out.println(" a = "+a);
			System.out.println("b = "+b);	
		}
	}
	
	private static class staticInnerClass
	{
		public void m4()
		{
			System.out.println("PrivateClass.innerClass.m3()");
			System.out.println("b = "+b);
		}
	}
	
	public void display()
	{
		PrivateClass ob = new PrivateClass();
		ob.m1();
		PrivateClass.m2();
		System.out.println("......................");
		PrivateClass.innerClass ob2 = ob.new innerClass();
		ob2.m3();
		System.out.println("...................");
		PrivateClass.staticInnerClass ob1 = new PrivateClass.staticInnerClass();
		ob1.m4();
	}
	
	public static PrivateClass getref()
	{
		PrivateClass ob = new PrivateClass();
		return ob;
	}
	
}
