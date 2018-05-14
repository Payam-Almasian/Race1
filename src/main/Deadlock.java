package main;

public class Deadlock {
	
	
	private final Object lockA = new Object();
	  
	      private final Object lockB = new Object();
	  
	      public void method1() {
	          synchronized (lockA) {
	              // Acquisition of 'lockB' (holding 'lockA')
	              synchronized (lockB) {
	                  System.out.println("dead");
	              }
	          }
	      }
	  
	      public void method2() {
	          synchronized (lockB) {
	              // Acquisition of 'lockA' (holding 'lockB')
	              synchronized (lockA) {
	                  System.out.println("lock");
	              }
	          }
	      }
	
	

}
