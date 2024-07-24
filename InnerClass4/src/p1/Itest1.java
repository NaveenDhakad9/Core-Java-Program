package p1;

public interface Itest1 {

	public int a=20;
	public abstract void dis();
	public default void dis1() {
		System.out.println("Itest1.dis1()");
	}
	public static void dis2()
	{
		System.out.println("Itest1.dis2()");
	}
}
