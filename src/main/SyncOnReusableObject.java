package main;

public class SyncOnReusableObject {
	
	
	
	private final Boolean bool = false;
	  
	      private final String string = "test";
	  
	      public void synchronizeOnBoolean() {
	          // Synchronizing on a reusable object
	          synchronized (bool) {
	              assert true;
	          }
	      }
	  
	      public void synchronizeOnStringLiteral() {
	          // Synchronizing on a String literal
	          synchronized (string) {
	              assert true;
	          }
	      }
	  
	      public void synchronizeOnStringOrInteger() {
	          Object stringOrInt = (Math.random() < 0.5) ? "test" : 32;
	          // Synchronizing on a String literal or reusable object
	          synchronized (stringOrInt) {
	              assert true;
	          }
	      }
	
	

}
