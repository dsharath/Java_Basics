import java.util.Hashtable;
import java.util.Vector;

public class BasicCollection {

	public static void main(String[] args) {

		
		int arr[] = new int[] {1,2,3,4};
		
		Vector<Integer> v = new Vector();
		
		Hashtable<Integer, String> h = new Hashtable();
		
		
		v.addElement(1);
		v.addElement(2);
		h.put(1, "sharath");
		h.put(2, "java");
		System.out.println(arr[3]);
		System.out.println(v.elementAt(1));
		System.out.println(h.get(1));
	}

}
