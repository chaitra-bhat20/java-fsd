//method overloading
public class overloadingMethod {
	
public void area(int b,int h)
    {
         System.out.println("Area of a Triangle is: "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of a Circle is : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

overloadingMethod xy=new overloadingMethod();
       xy.area(70,26);
       xy.area(8);  
   }
}
