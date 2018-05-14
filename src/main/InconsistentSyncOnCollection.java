package main;

import java.util.HashMap;
import java.util.Map;

 public class InconsistentSyncOnCollection {
  
      // Accesses to the collection in field 'map' are inconsistently synchronized.
      private final Map<String, Object> map = new HashMap<String, Object>();  
      public synchronized Object getOrCreate(String key) {
          Object value = map.get(key);
          if (value == null) {
              value = new Object();
              map.put(key, value);
          }
          return value;
      }
  
      public boolean available(String key) {
          return map.containsKey(key);
      }
  
  }