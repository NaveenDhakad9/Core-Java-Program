package p1;

public interface Itest1 extends Itest {

 	public abstract void dis2();

	public static void sum()
	{
		System.out.println("Static concrete method of interface Itest1 ");
	}
	
 	public default void sum1()
 	{
 		System.out.println("dafault concrete method of interface Itest1");
 	}
}
