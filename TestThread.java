
public class TestThread {

	
	public static void main(String args[]) {
		
	      RunnableDemo R1 = new RunnableDemo( "t1");
	      R1.start();
	      
	      RunnableDemo R2 = new RunnableDemo( "T2");
	      R2.start();
	   }   
}
