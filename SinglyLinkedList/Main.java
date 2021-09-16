//Singly Linked List 

package SinglyLinkedList;


public class Main {
    
    public static void main(String[] args) { 
        
        Employee frank = new Employee("Frank", "Cano", 1111); 
        Employee johnDoe = new Employee("John", "Doe", 2222); 
        Employee marySmith = new Employee("Mary", "Smith", 3333); 
        Employee mike = new Employee("Mike", "wilson", 4444); 
        
        EmployeeLinkedList list = new EmployeeLinkedList(); 
        
        list.addToFront(mike);
        list.addToFront(marySmith); 
        list.addToFront(johnDoe);
        list.addToFront(frank); 
        
        System.out.println(list.isEmpty()); 
        
        System.out.println(list.getSize()); 
        
        list.removeFromFront(); 
        
        System.out.println(list.getSize()); 
        
        
        list.printList();
               
    }
 }

