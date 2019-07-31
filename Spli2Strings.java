import java.util.ArrayList;
import java.util.List;

public class Spli2Strings {

	static String name = "Sharath";
	static String name2 = "Ramya";

	static List<String> namesha = new ArrayList<String>();

	static List<String> nameram = new ArrayList<String>();
	public static void namesplitter(String[] sname) {

		for (String s : sname) {

			namesha.add(s);
		}

	}

	public static void namesplitter2(String[] sname) {

		for (String s : sname) {

			// System.out.println(s);
			nameram.add(s);
		}

	}

	public static void main(String[] args) {

		
	//	mixname("sharath","Ramya");
//		List<String> mixname = new ArrayList<String>();
//		String[] sname = name.split("");
//
//		String[] sname2 = name2.split("");
//		int i = 0;
//		int i1 = 0;
//
//		namesplitter(sname);
//		namesplitter2(sname2);
//
//		while (i < namesha.size()|| i1 < nameram.size()) {
//			if (i < namesha.size())
//				mixname.add(namesha.get(i).toString());
//			i++;
//			if (i1 < nameram.size())
//				mixname.add(nameram.get(i1).toString());
//			i1++;
//
//		}

		System.out.println(mixname("Sharath","Ramya"));

	}

	
	public static String mixname(String name1, String name2) {
		
		
		
		int lname1= name1.length();
		int lnmae2 = name2.length();
		
		String name3 = "";
		
		int maxlen =Math.max(lname1, lnmae2);
		
		
		for(int i=0; i<=maxlen;i++) {
			
			if(i<= lname1-1)
				name3=name3+name1.charAt(i);
			if(i<= lnmae2-1) 
				name3=name3+name2.charAt(i);
			
				
			
			
		}
		
		
		
		
		
		return name3;
	}
}
