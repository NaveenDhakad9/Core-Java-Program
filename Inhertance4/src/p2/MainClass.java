package p2;

import p1.Iclass;
import p1.Itest;
import p1.Itest1;

public class MainClass{
	
	public static void main(String[] args)
	{
		Iclass ic = new Iclass();
		ic.dis();
		ic.dis1();
		ic.dis2();
		Itest1.sum();
		ic.sum1();
		ic.mul1();
	}
}
