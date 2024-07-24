package p2;


import p1.Itest;
import p1.Itest1;
import p1.OuterClass;
public class MainClass {
  
	public static void main(String[] args)
	{
		OuterClass uc = new OuterClass()
				{
			       public void dis()
			       {
			    	   System.out.println("MainClass.main(...).new OuterClass() {...}.dis1()");
			    	   System.out.println("..."+a+","+b);
			       }
				};
				uc.dis();
				uc.dis1();
		Itest it = new Itest()
				{
			        public void dis()
			        {
			        	System.out.println("ChildClass Itest() {...}.dis()");
			        	System.out.println(".."+a);
			        }
				};
				it.dis();
				it.dis1();
				Itest.dis2();
				
		Itest1 ob =()->
		{
			System.out.println("ChildClass Itest() {...}.dis()");
		};
		ob.dis();
		ob.dis1();
	}
}
