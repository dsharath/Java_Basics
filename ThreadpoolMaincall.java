import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadpoolMaincall {

	
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		
		Future<String> output = null;
		ThreadpoolExecutorExample thEx =new ThreadpoolExecutorExample();
		
		
		//ThreadPoolExecutor th= new ThreadPoolExecutor(15, 20, 10, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
	//	ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		long startTime = System.nanoTime();
	//	ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newScheduledThreadPool(10);
		
	//	ExecutorService executor =   Executors.newSingleThreadExecutor();
		output=executor.submit(thEx);
		
		try {
			for (int i = 1; i <= 5000; i++)
	        {
		String result= output.get(3,TimeUnit.SECONDS);
	        
		System.out.println(executor.getMaximumPoolSize());
		System.out.println(executor.allowsCoreThreadTimeOut());
		System.out.println(executor.getPoolSize());
		System.out.println(executor.getThreadFactory());
		System.out.println(executor.getTaskCount());
		System.out.println(executor.getLargestPoolSize());
		System.out.println(executor.getActiveCount());
		System.out.println(result);
	        }
			long endTime   = System.nanoTime();
			long totalTime = endTime - startTime;
			System.out.println("time in nano sec:: "+totalTime);	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
