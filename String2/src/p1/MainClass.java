package p1;

public class MainClass {

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+ sb.length());
		sb.append("Naveen");
		System.out.println("Data in sb : "+sb);
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+ sb.length());
		
		sb.append(" Dhakad");
		System.out.println("Data in sb : "+sb);
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+ sb.length());
		sb.append(" software");
		System.out.println("Data in sb : "+sb);
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+ sb.length());
		sb.insert(7,"dhdhdhd");
		System.out.println("Data in sb : "+sb);
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+ sb.length());
		sb.delete(7,14);
		System.out.println("Data in sb : "+sb);
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+ sb.length());
		sb.reverse();
		System.out.println("Data in sb : "+sb);
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+ sb.length());
		
		
		
		
	}
}
