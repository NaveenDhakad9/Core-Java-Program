package p1;

public class C2 extends C1{
	
      public int x=1;
      public static int y=2;
      @Override
      public void dis()
      {
    	  System.out.println("Overriden method of parent class");
      }
      public void dis3()
      {
  		System.out.println("childClas Display Method ");
  		System.out.println("...."+a+","+b+","+x+","+y);
      }
      
      public static void dis4()
      {
  		System.out.println("childClass Display Method ");
  		System.out.println("...."+b+","+y);
      }
      
}
