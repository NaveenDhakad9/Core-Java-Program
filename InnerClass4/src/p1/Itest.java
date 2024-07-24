package p1;

public interface Itest {

	public int a=10;
	public abstract void dis();
	public default void dis1() {
		System.out.println("Itest.dis1()");
	}
	public static void dis2()
	{
		System.out.println("Itest.dis2()");
	}
	
}
