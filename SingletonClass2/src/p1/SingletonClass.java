package p1;

public class SingletonClass {

	private static SingletonClass sc;
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getref()
	{
		if(sc==null)
		{
			sc = new SingletonClass();
		}
		return sc;
	}
	
	public void dis(int k)
	{
		System.out.println("SingletonClass.dis()");
		System.out.println(" k = "+k);
	}
}
