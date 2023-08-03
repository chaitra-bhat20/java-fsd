
import java.util.*;

public class collectionEx {

 public static void main(String[] args) {
	//creating arraylist
	System.out.println("ArrayList");
	ArrayList<String> subject=new ArrayList<String>();   
	subject.add("Maths");//
	subject.add("Science");    	   
	System.out.println(subject);  
		
    //creating vector
	System.out.println("\n");
	System.out.println("Vector");
	Vector<Integer> vect = new Vector();
	vect.addElement(75); 
	vect.addElement(26); 
	System.out.println(vect);
		
	//creating linkedlist
	System.out.println("\n");
	System.out.println("LinkedList");
	LinkedList<String> names=new LinkedList<String>();  
	names.add("Chaitra");  
	names.add("Bhat");  	      
	Iterator<String> itr=names.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	       
    //creating hashset
	System.out.println("\n");
	System.out.println("HashSet");
	HashSet<Integer> set1=new HashSet<Integer>();  
	set1.add(111);  
	set1.add(112);  
	set1.add(113);
	set1.add(114);
	System.out.println(set1);
	       
	//creating linkedhashset
	System.out.println("\n");
	System.out.println("LinkedHashSet");
	LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	set2.add(20);  
	set2.add(21);  
	set2.add(22);
	set2.add(23);	       
	System.out.println(set2);
	   	} 
	  }  
	}
