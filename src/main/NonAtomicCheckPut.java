package main;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NonAtomicCheckPut {
	
	
	private final List<Object> list = new CopyOnWriteArrayList<Object>();
	  
	      public void ensurePresent(Object obj) {
	          if (!list.contains(obj)) {      // Content check
	              // Non-atomic use of check/put.
	              list.add(obj);
	          }
	      }
	

}
