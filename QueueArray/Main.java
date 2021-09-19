
package QueueArray;

/**
 *
 * @author Franklin C.K
 */

public class Main {
    
    public static void main(String[] args) { 
    Employee frank = new Employee("Frank", "Cano", 1111); 
    Employee frank2 = new Employee("Frank2", "Cano2", 2222); 
    Employee frank3 = new Employee("Frank3", "Cano3", 3333); 
    Employee frankAdded = new Employee("FrankAdded", "Added4", 4444); 
    
    ArrayQueue queue = new ArrayQueue(10);
    
    queue.add(frank); 
    queue.add(frank2); 
    queue.add(frank3); 
    
    
    queue.printQueue();
    
    queue.remove(); 
    System.out.println(""); 
    
    System.out.println("AFTER REMOVING FROM QUEUE: "); 
    
    queue.printQueue(); 
    
    System.out.println("");
    
    System.out.println("AFTER ADDING TO THE QUEUE: "); 
    
    queue.add(frankAdded);
    
    queue.printQueue(); 
    
    
    } 
    
}
