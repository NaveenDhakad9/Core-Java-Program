package p1;

public abstract class  AbstractClass {
    static {
    	System.out.println("AbstractClass.staticBlock");
    }
    
    public AbstractClass()
    {
    	System.out.println("constractor of AbstractClass");
    }
	
    public int a;
	public void sum()
	{
		System.out.println("AbstractClass.sum()");
	}
	
	public abstract void sum1();

}
