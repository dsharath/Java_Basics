import java.util.PriorityQueue;

public class PriorityQueueExamples {

	public static void main(String[] args) {

		
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		
		queue.add("sharath");
		queue.add("chandra");
		queue.add("java");
		queue.add("developer");
		System.out.println(queue);
		
		System.out.println("head:: "+queue.element());
		System.out.println("head:: "+queue.peek());
		
		queue.remove();
		System.out.println("after removing:: "+queue);
		
		queue.poll();
		System.out.println(queue);
	
	}

}
