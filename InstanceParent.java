package snippet;

public class InstanceParent {

	int i =10;
	{
		m1();
		System.out.println("Parent First instance block...");
	}
	
	InstanceParent(){
		System.out.println("Parent constructor...");
	}
	
	public static void main(String[] args) {

		InstanceParent ip = new InstanceParent();
		
		System.out.println("Parent Main Method...");
	}
	
	public void m1() {
		System.out.println(j);
	}

	int j =20;
}
