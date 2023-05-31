import java.util.*;
import java.util.LinkedList;
public class QueueEx {
	public static void main(String[] args) 
	{
	        		Queue<String> fruitsQueue = new LinkedList<>();
	                fruitsQueue.add("Apple");
	        		fruitsQueue.add("Banana");
	        		fruitsQueue.add("Mango");
	        		fruitsQueue.add("Cherry");
	        		fruitsQueue.add("Orange");
	                System.out.println("Queue is : " + fruitsQueue);
	        		System.out.println("Head of Queue : " + fruitsQueue.peek());
	        		fruitsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + fruitsQueue);
	        		System.out.println("Size of Queue : " + fruitsQueue.size());
	    	}
	}

