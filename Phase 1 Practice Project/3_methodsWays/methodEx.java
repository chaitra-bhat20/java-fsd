//method example
public class methodEx {

public int multipynumbers(int x,int y) {
	int m=x*y;
	return m;
}

public static void main(String[] args) {

	methodEx y = new methodEx();
	int mul = y.multipynumbers(220,17);
	System.out.println("Multipilcation result is :"+mul);
	}
}

