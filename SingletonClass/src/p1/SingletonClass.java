package p1;

public class SingletonClass {

	private static SingletonClass sc;
	private SingletonClass()
	{
		
	}
	
	static 
	{
		sc = new SingletonClass();
	}
	
	public static SingletonClass getref()
	{
		return sc;
	}
	
	public void dis(int k)
	{
		System.out.println("SingletonClass.dis()");
		System.out.println(" k = "+k);
	}
}
