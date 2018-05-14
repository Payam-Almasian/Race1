package main;

public class InconsistentSyncOnField {
	
	
	private int y;
	 
	      public synchronized void increment() {
	          y++;                            // Synchronized read/write
	      }
	  
	      public synchronized void decrement() {
	          y--;                            // Synchronized read/write
	      }
	  
	      public int get() {
	          return y;                       // Unsynchronized read
	      }
	
	

}
