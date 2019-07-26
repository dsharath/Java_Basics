import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnumSetExample {
	
	enum days{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}

	public static void main(String[] args) {
		
		
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);

		
		Iterator<days> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	Set<days> set1 = EnumSet.allOf(days.class);
	System.out.println("week days:  "+set1);
	
	Set<days> set2 =EnumSet.noneOf(days.class);
	System.out.println("week dasys:: "+set2);
	
	
	
	
	System.out.println("\n"+"enumap starts::");
	
	EnumMap<days,String> map = new EnumMap<days, String>(days.class);
	
	
	map.put(days.MONDAY, "1");
	map.put(days.TUESDAY, "2");
	map.put(days.WEDNESDAY,"3");
	map.put(days.THURSDAY, "4");
	
	
	for(Map.Entry m: map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	}
	
	

}
