
//using linkedlists with the JDK 

package LinkedListJDK;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Franklin C.K 
 */
public class Main {
    
    public static void main(String[] args) { 
        
        Employee frankHerbert = new Employee("Frank", "Herbert", 1111);
        Employee lilyVas = new Employee("Lily", "Vas", 2222);
        Employee johnDoe = new Employee("John", "Doe", 3333); 
        Employee bobVance = new Employee("Bob", "Vance", 4444); 
        Employee billEnd = new Employee("Bill", "End", 5555); 
        
        
        LinkedList<Employee> list = new LinkedList<>(); 
        
        list.addFirst(johnDoe);
        list.addFirst(lilyVas); 
        list.addFirst(bobVance); 
        list.addFirst(frankHerbert); 
        
        //to print using jdk 
        
        Iterator iter = list.iterator(); 
        System.out.print("HEAD  -> "); 
        while(iter.hasNext()) { 
            System.out.print(iter.next());
        System.out.print("<=>"); 
        } 
        
        System.out.println("null"); 
        
        /* Can also print list using a for loop 
        for (Employee employee : list) { 
            System.out.println(employee); 
        } 
        */
        
        //add method adds at the end (tail) or you can use addLast() 
        //list.add(billEnd); 
        
        System.out.println("AFTER ADDING TO THE END"); 
        
        list.addLast(billEnd);
        iter = list.iterator(); 
        System.out.print("HEAD  -> "); 
        while(iter.hasNext()) { 
            System.out.print(iter.next());
        System.out.print("<=>"); 
        } 
        
        System.out.println(""); 
        
        //removing first 
        System.out.println("AFTER REMOVING FIRST");
        list.removeFirst(); 
        iter = list.iterator(); 
        System.out.print("HEAD  -> "); 
        while(iter.hasNext()) { 
            System.out.print(iter.next());
        System.out.print("<=>"); 
        } 
        
        System.out.println(""); 
        
        
        //removing last 
        System.out.println("AFTER REMOVING FROM LAST"); 
        
        list.removeLast(); 
        iter = list.iterator(); 
        System.out.print("HEAD  -> ");
        while(iter.hasNext()) { 
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        
          System.out.println(""); 
        
        
        
        
        
        
    }
}
