import java.util.TreeSet;

public class TreesetExam {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);

		System.out.println(set);
		System.out.println("highest value :; " + set.pollFirst());
		System.out.println("Lowest value::  " + set.pollLast());

		TreeSet<String> set1 = new TreeSet<String>();

		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		set1.add("E");

		System.out.println("Intial set:  " + set1);
		System.out.println("Reverse set:: " + set1.descendingSet());
		System.out.println("Head Set:: " + set1.headSet("C", true));

		System.out.println("Subset :: " + set1.subSet("A", false, "E", true));

		System.out.println("Tailset :: " + set1.tailSet("C", true));

		System.out.println("\n" + "\n");

		System.out.println("Head Set:: " + set1.headSet("C"));

		System.out.println("Subset :: " + set1.subSet("A", "E"));

		System.out.println("Tailset :: " + set1.tailSet("C"));

	}

}
