import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BasicCollections {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("c");
		list.add("sharath");
		list.add("java");

		System.out.println("values in the list:: " + list);

		Collections.addAll(list, "developrt", "junior");

		System.out.println("values in the collections:: " + list);

		String[] strArr = { "c#", ".Net" };
		Collections.addAll(list, strArr);

		System.out.println("collections after adding the string array.::" + list);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(22);
		intlist.add(23);
		intlist.add(27);
		intlist.add(26);
		intlist.add(2000);

		System.out.println("max value from the list::: " + Collections.max(intlist));
		System.out.println("min value from the list::: " + Collections.min(intlist));

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("                Sorting elements of a list              ");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		ArrayList<String> al = new ArrayList<String>();
		al.add("sharath");
		al.add("office depot");
		al.add("boca raton");
		al.add("florida");

		Collections.sort(al);

		Iterator itr = al.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("                Sorting elements in a reverse order of a list              ");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		Collections.sort(al, Collections.reverseOrder());

		Iterator itrR = al.iterator();

		while (itrR.hasNext()) {

			System.out.println(itrR.next());
		}
		
		
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("                Sorting wrapper class objects.              ");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		ArrayList intlists = new ArrayList();
		
		intlists.add(Integer.valueOf(2000));
		intlists.add(Integer.valueOf(500));
		intlists.add(800);
		
		Collections.sort(intlists);
		
		Iterator wrapperlist = intlists.iterator();
		
		while(wrapperlist.hasNext()) {
			
			System.out.println(wrapperlist.next());
		}
		
		
		
		

	}

}
