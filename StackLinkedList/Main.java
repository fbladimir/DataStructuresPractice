
package StackLinkedList;

/**
 *
 * @author Franklin C.K 
 */
public class Main {
    
    public static void main(String[] args) { 
        
        Employee frankCano = new Employee("Frank", "Cano", 1111); 
        Employee frankCano2 = new Employee("Frank2", "Cano2", 2222); 
        Employee frankCano3 = new Employee("Frank3", "Cano3", 3333); 
        Employee frankCano4 = new Employee("Frank4", "Cano4", 4444); 
        
        
        LinkedStack stack = new LinkedStack(); 
        
        stack.push(frankCano); 
        stack.push(frankCano2); 
        stack.push(frankCano3); 
        stack.push(frankCano4); 
        
        stack.printStack();
        
        System.out.println(stack.peek()); 
        
        
        
    }
}
