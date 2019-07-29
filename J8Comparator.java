import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class J8Comparator {

	public static void main(String[] args) {

		
		ArrayList<StudentData> al = new ArrayList<StudentData>();
		
		al.add(new StudentData(100,"sharath",27));
		al.add(new StudentData(10,"java",88));
		al.add(new StudentData(80,"developer",10));
		al.add(new StudentData(800,null,10));
		
		
		String regex = "[$&+,:;= ?@#|'<>.^*()%!0-9-]";
		String ht = "HeLlo There";
		
		
		
		String base ="MkjtMkx";
		String remove = "iS";
		String temc = remove.toUpperCase();
		String templ = remove.toLowerCase();
		if(base.contains(temc)||base.contains(templ)){
			  
			  
			  base=base.replaceAll(temc,"");
			    base=base.replaceAll(remove,"");
			    base=base.replaceAll(templ,"");

			}  
		System.out.println(base);
		
		
		
		String str = "y2bz";
	 	//String regex = "[$&+,:;= ?@#|'<>.^*()%!0-9-]";
	  	int count=0;
			for(String d:str.split(regex)) {
				if(d.toLowerCase().endsWith("y")||d.toLowerCase().endsWith("z")){ 
				count ++;
				}
			}
			System.out.println(count);
		System.out.println("\n");
		
		//sorting by name
		Comparator<StudentData> csn= Comparator.comparing(StudentData::getName,Comparator.nullsLast(String::compareTo));
		  

		Collections.sort(al, csn);
		
		System.out.println("sorting by name:::");
		
		for(StudentData sd:al) {
			System.out.println(sd.age+" "+sd.name+" "+sd.rollno);
		}

		System.out.println("\n");
		
		System.out.println("sorting by age::");
		
		Comparator<StudentData> csa = Comparator.comparing(StudentData::getAge);
		
		Collections.sort(al,csa);
		
		for(StudentData sd: al) {
			
			System.out.println(sd.age+" "+sd.name+" "+sd.rollno);
		}
		
	}

}
