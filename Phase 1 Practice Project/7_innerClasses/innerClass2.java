
public class innerClass2 {
   private String message="Inner Classes of Java";

	 void display()
	 {  
	 class Inner
	 {  
	 void message()
	 {
	 System.out.println(message);
		 }  
	  }  
		  
	  Inner a=new Inner();  
	  a.message();  
	 }  

	
	public static void main(String[] args) 
	{
	    innerClass2  ob=new innerClass2();  
		ob.display();  
	}
 }


