package p1;

public interface Itest {

	public static final int a = 1;

	public abstract void dis();

	public static void sum() {
		System.out.println("Static concrete method of interface itest");
	}

	public default void sum1() {
		System.out.println("dafault concrete method of interface itest");
	}

	private void mul() {
		System.out.println("Private concrete method of interface itest");
	}

	public default void mul1() {
		this.mul();
	}

}
