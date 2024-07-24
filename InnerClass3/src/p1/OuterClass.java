package p1;

public class OuterClass {
	public int a = 10;
	public static int b = 20;

	public void instnaceInner() {
		class LocalInner {
			public void sum() {
				System.out.println("OuterClass.instnaceInner().LocalInner.sum1()");
				System.out.println(a + b);
			}

			public static void sum1() {
				System.out.println("OuterClass.instnaceInner().LocalInner.sum1()");
				System.out.println(b);
			}
		}

		LocalInner li = new LocalInner();
		li.sum();
		LocalInner.sum1();
	}

	public static void LocalInner1() {
		class LocalInner {
			public void sum() {
				System.out.println("OuterClass.LocalInner1().LocalInner.sum()");
				System.out.println(b);
			}

			public static void sum1() {
				System.out.println("OuterClass.LocalInner1().LocalInner.sum()");
				System.out.println(b);
			}
		}

		LocalInner li = new LocalInner();
		li.sum();
		LocalInner.sum1();
	}
}
