package main;

import java.util.concurrent.locks.ReentrantLock;

public class IsLockedThenLock {
	
	
	private final ReentrantLock lock = new ReentrantLock();
	  
	      private int x = 0;
	  
	      public void update() {
	          // Might be better to replace use of isLocked() and then locked() by
	          // tryLock()
	          if (!lock.isLocked()) {
	              lock.lock();                // Lock taken
	              try {
	                  x = x + 1;
	              } finally {
	                  lock.unlock();
	              }
	          }
	      }
	
	

}
