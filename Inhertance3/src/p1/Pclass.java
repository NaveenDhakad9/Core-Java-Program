package p1;

public class Pclass {
	/*
	public void dis(int a)
	{
		System.out.println("Parent Display Method ");
		System.out.println("...."+a);
	}
	
	public void dis2(int a,int b)
	{
		this.dis(a);
		System.out.println(" method of parent class");
		System.out.println("..."+b);
	}
	*/
	
	public Pclass(int a)
	{
		System.out.println("Parent constructor");
		System.out.println("..."+a);
	}
	
	public Pclass(int a,int b)
	{
		this(a);
		System.out.println("Parent constructor");
		System.out.println("..."+b);
	}
}
