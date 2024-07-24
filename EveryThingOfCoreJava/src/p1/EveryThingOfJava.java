package p1;

public class EveryThingOfJava {

	// 0Param Constructor
	public EveryThingOfJava() {
		System.out.println("0-ParamConsturctor EveryThingOfJava()");
	}

	// instance variable
	public int a = 1;
	// Static Variable
	public static int b = 20;
	
	// Static Block
	static {
		System.out.println("STATIC BLOCK");
		System.out.println("B Static component :: " + b);
	}
	
	//Instance block
	{
		System.out.println("INSTANCE BLOCK");
	}

	// non-Static method or instance method
	public void sum() {
		int c = 10;
		System.out.println("Sum = " + (a + b + c));
	}

	// Static method
	public static void sum1() {
		System.out.println("Sum1 = " + b);
	}

	// Method with parameter and return type
	public int sum(int e, int f) {
		return e + f;
	}

	// instance variable
	public int g, h;

	// Param Constructor
	public EveryThingOfJava(int g, int h) {
		// use of "this" keyword
		this.g = g;
		this.h = h;
	}

	// instance variable
	public int i, j;

	// Static Variable
	public static int k, l;

	// Setter Method
	public void set(int j) {
		this.j = j;
	}

	// Getter Method
	public int get() {
		return j;
	}


}
