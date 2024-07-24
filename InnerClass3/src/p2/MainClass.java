package p2;

import p1.OuterClass;

public class MainClass {

	public static void main(String[] args)
	{
		OuterClass uc = new OuterClass();
		uc.instnaceInner();
		OuterClass.LocalInner1();
	}
}
