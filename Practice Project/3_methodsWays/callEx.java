//call by value
public class callEx {

int val=235;

int operation(int val) {
	val =val*15/250;
	return(val);
}

public static void main(String args[]) {
	callEx a = new callEx();
	System.out.println("Before operation value of the data is "+a.val);
	a.operation(235);
	System.out.println("After operation value of the data is "+a.val);
	}
}
