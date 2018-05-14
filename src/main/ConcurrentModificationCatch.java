package main;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class ConcurrentModificationCatch {
	
	
	private final ArrayList<Object> list = new ArrayList<Object>();
	  
	      public void add(Object x) {
	          try {
	              list.add(x);
	          // ConcurrentModificationException is caught.
	          } catch (ConcurrentModificationException ex) {
	              ex.printStackTrace();
	          }
	      }
	
	
	

}
