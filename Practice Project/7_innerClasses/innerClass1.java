
public class innerClass1 {

   private String msg="Java"; 
		 
	class Inner
	{  
      void innerex()
      {
         System.out.println(msg+", Inner Classes");
       }  
	 }  


	public static void main(String[] args) {

	innerClass1 ob=new innerClass1();
	innerClass1.Inner in=ob.new Inner();  
	in.innerex();  
 	}
}

