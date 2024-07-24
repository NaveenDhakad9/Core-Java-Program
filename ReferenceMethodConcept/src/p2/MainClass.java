package p2;

import p1.Iclass;
import p1.Itest;

public class MainClass {

	public static void main(String[] args)
	{
		Itest it = Iclass :: new;
		it.dis();
	    Iclass ic = new Iclass();
	    Itest it1 = ic :: m1;
	    it1.dis();
	    Itest it2 = Iclass :: m2;
	    it2.dis();
	}
}
