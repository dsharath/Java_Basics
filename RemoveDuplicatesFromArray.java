

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	




	public int id;
	public String name;
	
	
	@Override
	public String toString() {
		return "RemoveDuplicatesFromArray [id=" + id + ", name=" + name + "]";
	}




	public RemoveDuplicatesFromArray(int id,String cname) {
		this.id=id;
		name= cname;
		
		
	}
	
	
	

//	public void removeDuplicates() {
//	
//		ArrayList<String> dupnames= new ArrayList<String>();
//		ArrayList<String> names= new ArrayList<String>();
//		
//	
//		names.add(0,"ganesh");
//		names.add(1, "ganesh");
//		names.add(2, "viswa");
//		names.add(2, "viswa");
//		names.add(3, "shiva");
//		names.add(4, "shiva");
//		
//		//removing duplicates using iterator
//		for(String lnames: names) {
//			
//			if(!dupnames.contains(lnames)) {
//				dupnames.add(lnames);
//			}
//		}
//		
//	System.out.println("using for loop::  "+dupnames);	
//	
//	
//	
//	//removing the duplicates using the set
//	Set<String> set = new LinkedHashSet<>(); 
//	
//	
//	set.addAll(names);
//	names.clear();
//	names.addAll(set);
//	
//	System.out.println("using set :: "+names);
//	
//	
//	
//	}
	
	public static void main(String[] args) {
		RemoveDuplicatesFromArray news= new RemoveDuplicatesFromArray(1,"sharath");
		RemoveDuplicatesFromArray new1= new RemoveDuplicatesFromArray(1,"sharath");
		RemoveDuplicatesFromArray new2= new RemoveDuplicatesFromArray(1,"sharath");
		
		ArrayList<RemoveDuplicatesFromArray> dupnames= new ArrayList<RemoveDuplicatesFromArray>();
		dupnames.add(news);
		dupnames.add(new1);
		dupnames.add(new2);
		
		removeDuplicates(dupnames);
		
	}




	private static void removeDuplicates(ArrayList<RemoveDuplicatesFromArray> dupnames) {
		
		
		
		Set<RemoveDuplicatesFromArray> set = new HashSet<RemoveDuplicatesFromArray>(dupnames);
		
		//set.addAll(dupnames);
		dupnames.clear();
		dupnames.addAll(set);
		
		System.out.println(dupnames);
		// TODO Auto-generated method stub
		
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RemoveDuplicatesFromArray other = (RemoveDuplicatesFromArray) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}




	private static void removeDuplicates() {
		// TODO Auto-generated method stub
		
		
		
	}
	}

	
		// TODO Auto-generated method stub
		
		


