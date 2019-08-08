package snippet;

public class StaticChild extends StaticParent{

	static int x = 100;
	static {
		m2();
		System.out.println("Child fist static block...");
	}
	public static void main(String[] args) {

		m2();
		System.out.println("Child main block...");
	}
	
	public static void m2() {
		System.out.println(y);
	}
	static {
		System.out.println("Child second stctic block....");
	}
	static int y =200;

}
