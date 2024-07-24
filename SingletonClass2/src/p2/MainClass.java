package p2;

import p1.SingletonClass;

public class MainClass {

	public static void main(String[] args)
	{
		SingletonClass ob = SingletonClass.getref();
		System.out.println(ob.hashCode());
		ob.dis(10);
		SingletonClass ob2 = SingletonClass.getref();
		System.out.println(ob.hashCode());
		ob2.dis(20);
		
	}
}
