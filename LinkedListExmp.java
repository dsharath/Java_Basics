import java.util.LinkedList;

public class LinkedListExmp {

	public static void main(String[] args) {

		
		
		LinkedList<String> ll=new LinkedList<String>();

		
		ll.add("Ravi");
		ll.add("Sharath");
		ll.add("afzal");
		ll.add("hemanth");
		ll.add("abi");
		System.out.println("intal elements:: "+ll);
		//removing the specific element
		ll.remove("Ravi");
		
		System.out.println("After invoking specific object:: "+ll);
		
		//removing the specific position element.
		
		ll.remove(2);
		
		System.out.println("after removing the postion value::  "+ll);
		
		LinkedList<String> ll2= new LinkedList<String>();
		
		ll2.add("ravi");
		ll2.add("hem");
		
		//adding ll2 to ll
		
		ll.addAll(ll2);
		
		System.out.println("after adding ll2 to ll ::  "+ll);
		
		ll.removeFirst();
		System.out.println("after  ll first element ::  "+ll);
		
		ll.removeLast();
		
		System.out.println("after removing last in ll ::  "+ll);
		
		
		//Removing first occurrence of element from the list  
        ll.removeFirstOccurrence("ravi");  
        System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
    //Removing last occurrence of element from the list  
        ll.removeLastOccurrence("afzal");  
        System.out.println("After invoking removeLastOccurrence() method: "+ll);  

        //Removing all the elements available in the list       
        ll.clear();  
        System.out.println("After invoking clear() method: "+ll);   
		
	}

}
