
package HashJDK;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Franklin C.K
 */
public class Main {
    
    public static void main (String[] args) { 
        
        Employee frank = new Employee ("Frank", "C", 1111); 
        Employee frank2 = new Employee ("Frank2", "C2", 2222);
        Employee frank3 = new Employee ("Frank3", "CA3", 3333);
        
        
        Map<String, Employee> hashMap = new HashMap<String, Employee>(); 
        
        hashMap.put("C", frank); 
        hashMap.put("C2", frank2); 
        hashMap.put("CA3", frank3); 
        //put if key is not used method 
        Employee employee = hashMap.putIfAbsent("C", frank2); 
        System.out.println(employee);   
       
        System.out.println("");
        
        
        //get method 
        System.out.println(hashMap.get("C"));
        System.out.println("IF NO ONE IS IN THE TABLE");
        System.out.println(hashMap.get("TEST"));
        
        System.out.println("STOPPING GET METHOD FROM RETURNING NULL");
        System.out.println(hashMap.getOrDefault("TEST", frank));
        
        System.out.println("");
        
        //remove employee 
        System.out.println("REMOVING EMPLOYEE ");
        System.out.println(hashMap.remove("C")); 
        
        System.out.println("");
        
        //Printing the rest after removing 
        System.out.println("REST AFTER REMOVING");
        Iterator<Employee> iterator2 = hashMap.values().iterator(); 
        while(iterator2.hasNext()) { 
            System.out.println(iterator2.next());
        }
        
        System.out.println("");
         
               
        //contain method 
        System.out.println("USING CONTAINS METHOD:  ");
        System.out.println(hashMap.containsKey("C"));
        System.out.println(hashMap.containsValue(frank));
        
        System.out.println("");
        
        Iterator<Employee> iterator = hashMap.values().iterator(); 
        
        while (iterator.hasNext() ) { 
            System.out.println(iterator.next());
        }
        
        System.out.println("");
        
        System.out.println("USING ANOTHER PRINTING METHOD");
        //another way to print 
        
        hashMap.forEach((k,v) -> System.out.println("KEY = " + k + " Employee = " + v));
        
        
        
    }
}
