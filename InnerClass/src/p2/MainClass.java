package p2;

import p1.OuterClass;

public class MainClass {

	public static void main(String[] args)
	{
		OuterClass oc = new OuterClass();
		oc.sum();
		OuterClass.sum1();
		OuterClass.InnerClass ob = new OuterClass.InnerClass();
		ob.dis();
		OuterClass.InnerClass.dis1();
	}
}
