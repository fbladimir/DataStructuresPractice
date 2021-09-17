//Doubly Linked List 

package DoublyLinkedList;


public class Main {
    
    public static void main(String[] args) { 
        
        Employee frank = new Employee("Frank", "Cano", 1111); 
        Employee johnDoe = new Employee("John", "Doe", 2222); 
        Employee marySmith = new Employee("Mary", "Smith", 3333); 
        Employee mike = new Employee("Mike", "wilson", 4444); 
        
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList(); 
        
        list.addToFront(mike); 
        list.addToFront(marySmith); 
        list.addToFront(johnDoe); 
        list.addToFront(frank); 
        
        list.printList(); 
        
        System.out.println(list.getSize()); 
        
        Employee billEnd = new Employee("Bill", "End", 5555); 
        
        list.addToEnd(billEnd); 
        
        list.printList(); 
        
        System.out.println(list.getSize());
        
        System.out.println("AFTER REMOVING FRONT NODE: ");
        
        //removing a node from the front 
        list.removeFromFront(); 
        
        //printing out the result after removing 
        
        list.printList(); 
        
        System.out.println(list.getSize()); 
        
  
        
               
    }
 }

