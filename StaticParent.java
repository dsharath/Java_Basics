package snippet;

public class StaticParent {
	
	static int i = 10;

	static {
		m1();
		System.out.println("Parent first static block..");
	}
	
	public static void main(String[] args) {
	m1();
	System.out.println("parent main method....");
	}
	public static void m1() {
		System.out.println(j);
	}

	static int j=20;
}

