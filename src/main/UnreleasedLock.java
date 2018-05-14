package main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnreleasedLock {
	
	
	
	private final Lock lock = new ReentrantLock();
	  
	      private final int[] values = { 0, 0, 0, 0, 0 };
	  
	      public int getAndIncrementBad(int i) {
	          int result;
	  
	          lock.lock();
	  
	          // This line might thrown an ArrayIndexOutOfBoundsException,
	          // causing 'lock' to not properly be released.
	          result = values[i];
	          values[i]++;
	  
	          lock.unlock();
	  
	          return result;
	      }
	
	

}
