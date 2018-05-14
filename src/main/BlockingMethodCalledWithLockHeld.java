package main;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingMethodCalledWithLockHeld {
	
	
	private final BlockingQueue<Integer> queue =
			          new LinkedBlockingDeque<Integer>();
			  
			      public synchronized Integer take() throws InterruptedException {
			          // Blocking removal from queue
			          return queue.take();
			      }
			  
			      public synchronized void add(int x) {
			          // Insertion into queue
			          queue.add(x);
			      }
			  
			      public void clear() {
			          queue.clear();
			      }
	

}
