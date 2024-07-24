package concatString;

public class MainClass {
    
	public static void main(String args[])
	{
		String s1 = "Naveen";
		String s2 = "Dhakad";
		
		s1 = s1 + " " +s2;
		
		System.out.println("Data in S1 "+ s1);
		
		String s3 = "I";
		String s4 = "am";
		
		String s5 = s3.concat(" "+s4).concat(" "+s1);
		
		System.out.println("Data in S5 : "+s5);
	}
}
