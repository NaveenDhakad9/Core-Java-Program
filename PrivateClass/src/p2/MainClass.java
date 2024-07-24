package p2;

import p1.PrivateClass;

public class MainClass {

	public static void main(String[] args)
	{
		PrivateClass ob = PrivateClass.getref();
		ob.display();
	}
}
