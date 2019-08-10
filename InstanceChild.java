package snippet;

public class InstanceChild extends InstanceParent{

	int x= 100;
	{
		m2();
		System.out.println("Child first instance Block...");
	}
	
	InstanceChild(){
		
		System.out.println("Child Constructor...");
	}
	public static void main(String[] args) {
		
		InstanceChild ic = new InstanceChild();
		System.out.println("After object creation 'y' wil be..."+ic.y);
		System.out.println("Child Main Method...");
	}
	
	public void m2() {
		System.out.println(y);
	}
	{
		
		System.out.println("Child Second Instance Block...");
	}
	
	int y =200;
}
