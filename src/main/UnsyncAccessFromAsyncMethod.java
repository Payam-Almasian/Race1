package main;

public class UnsyncAccessFromAsyncMethod {
	
	
	 private Object value;
	   
	       private class UpdateField implements Runnable {
	           public void run() {             // Asynchronously invoked method
	               value = new Object();       // Unsynchronized write
	           }
	       }
	   
	       public void startBackgroundThread() {
	           Thread thread = new Thread(new UpdateField());
	           thread.start();
	       }
	   
	       public Object getValue() {
	           return value;                   // Unsynchronized read
	       }
	
	
	

}
