class studDetails
{
	int regno;
	String name;
	
void disp() 
   {
	System.out.println("Default value is:"+ regno+" "+name);
	}
}

public class defConstructor 
{
public static void main(String[] args) {

	studDetails stud1=new studDetails();
	studDetails stud2=new studDetails();
	
	stud1.disp();
	stud2.disp();
	
	}
}
