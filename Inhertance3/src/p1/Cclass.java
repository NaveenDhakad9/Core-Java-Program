package p1;

public class Cclass extends Pclass {
    
	/*
	public void dis(int a,int b,int c)
	{
		super.dis2(a, b);
		System.out.println("child Display Method ");
		System.out.println("...."+c);
	}
	
	public void dis2(int a,int b,int c,int d)
	{
		this.dis(a, b, c);
		System.out.println(" method of child class");
		System.out.println("..."+d);
	}
	*/
	public Cclass(int a,int b,int c)
	{
		super(a,b);
		System.out.println("Child constructor");
		System.out.println("..."+c);
	}
	
}
