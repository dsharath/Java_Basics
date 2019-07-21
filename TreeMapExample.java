import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		
		SortedMap<Integer,String> map =new TreeMap<Integer, String>();
		
		map.put(100, "sharath");
		map.put(102, "java");
		map.put(101, "developer");
		map.put(108,"fl");
		
		System.out.println("headp map:: "+map.headMap(102));

		
		System.out.println("tail map:: "+map.tailMap(102));
		
		System.out.println("sub map:: "+map.subMap(101,108));
	}

}
