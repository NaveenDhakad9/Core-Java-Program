package p1;

public class Iclass implements Itest,Itest1 {

	public void dis() {
		System.out.println("abstract method of interface Implements in Childclass ");
	}
	
	public void dis2() {
		System.out.println("abstract method of interface Itest1 Implements in Childclass ");
	}

	public void dis1() {
		System.out.println("implements Class method");
	}
}