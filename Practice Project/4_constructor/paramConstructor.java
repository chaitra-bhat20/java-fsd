//parameterized constructor
class Employee{
	int EmpID,salary;
	String name;

	Employee(int i,String n,int s)
	{
		EmpID=i;
	    name=n;
	    salary=s;
	}

	void display() {
	System.out.println(EmpID+" "+name+" "+salary);
	}
}

public class paramConstructor {
public static void main(String[] args) 
{
	Employee emp1=new Employee(101,"Chaitra",25000);
	Employee emp2=new Employee(201,"Bhat",30000);
	Employee emp3=new Employee(301,"Rama",35000);
	emp1.display();
	emp2.display();
	emp3.display();
		}
}

