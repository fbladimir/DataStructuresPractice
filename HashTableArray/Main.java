
package HashTableArray;

/**
 *
 * @author Franklin C.K
 */
public class Main {
    
    public static void main (String[] args) { 
        
        Employee frank = new Employee("Frank", "C", 1111); 
        Employee frank2 = new Employee("Frank2", "Ca", 2222);
        Employee frank3 = new Employee("Frank3", "Can", 3333);
        Employee uhOh = new Employee("Frank4", "uhO", 4444); 
        
        SimpleHashtable ht = new SimpleHashtable(); 
        
        ht.put("C", frank);
        ht.put("Ca", frank2);
        ht.put("Can", frank3); 
        ht.put("UhO", uhOh); 
        
        ht.printHashTable();
        
        System.out.println("GETTING A HASH VALUE: ");
        System.out.println(ht.get("C"));  
        
        
        
    }
}
