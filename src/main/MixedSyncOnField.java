package main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MixedSyncOnField {
	
	
	private final Lock lock1 = new ReentrantLock();
	  
	      private final Lock lock2 = new ReentrantLock();
	  
	      // Access to field 'x' are synchronized using different locks.
	      private int x;
	  
	      public void increment() {
	          lock1.lock();
	          try {
	              x = 1;                      // Synchronized write
	          } finally {
	              lock1.unlock();
	          }
	      }
	  
	      public int get() {
	         lock2.lock();
	          try {
	              return x;                   // Synchronized read
	          } finally {
	              lock2.unlock();
	          }
	      }
	
	

}
