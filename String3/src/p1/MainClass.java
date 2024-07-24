package p1;

public class MainClass {

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
        System.out.println("Capacity : "+sb.capacity());
        System.out.println("Length : "+sb.length());
        sb.append("Naveen Dhakad");
        System.out.println("Data : "+sb);
        System.out.println("Capacity : "+sb.capacity());
        System.out.println("Length : "+sb.length());
        
        System.out.println(".............................");
        
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity : "+sb1.capacity());
        System.out.println("Length : "+sb1.length());
        sb1.append("Naveen Dhakad");
        System.out.println("Data : "+sb1);
        System.out.println("Capacity : "+sb1.capacity());
        System.out.println("Length : "+sb1.length());
        /*
        String sb3= sb1.substring(0,5);
        System.out.println("SubString : "+sb3);*/
        
        if(sb.toString().equals(sb1.toString())) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
		
		
		
		
	}
}
