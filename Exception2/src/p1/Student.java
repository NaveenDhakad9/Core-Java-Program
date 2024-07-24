package p1;

public class Student extends Exception {

	public Student(String msg) {
		super(msg);
	}

	public void check(int i) throws Student {
		try {
			switch (i) {
			case 111:
				break;
			case 222:
				break;
			case 333:
				break;

			default:
				Student s = new Student("Invaild RollNumber");
				throw s;
			}
		} catch (Student s) {
			throw s;
		}
	}
}
