import java.util.*;
public class mapsEx {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Bhat");    
	      hm.put(2,"Chetu");    
	      hm.put(3,"Chaitra");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry a:hm.entrySet()){    
	       System.out.println(a.getKey()+" "+a.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Tim");  
	      ht.put(5,"James");  
	      ht.put(6,"Marie");  
	      ht.put(7,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry b:ht.entrySet()){    
	      System.out.println(b.getKey()+" "+b.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Java");    
	      map.put(9,"C");    
	      map.put(10,"C++");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry i:map.entrySet()){    
	      System.out.println(i.getKey()+" "+i.getValue());    
	      }    
	      
	   }  
}
