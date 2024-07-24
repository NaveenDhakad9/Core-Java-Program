package p1;

public class OuterClass {
	public int a=10;
	public static int b=20;
	public  void dis() {
		System.out.println("OuterClass.dis()");
		System.out.println(".."+a+","+b);
	}
	
	public  void dis1() {
		System.out.println("OuterClass.dis()");
		System.out.println(".."+a+","+b);
	}
}
