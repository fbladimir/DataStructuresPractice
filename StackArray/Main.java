
package StackArray;

/**
 *
 * @author Franklin C.K 
 */
public class Main {
    
    public static void main(String[] args) { 
        
        ArrayStack stack = new ArrayStack(10);
        
        stack.push(new Employee ("Jane", "Jones", 1111)); 
        stack.push(new Employee("Frank", "Cool", 2222)); 
        stack.push(new Employee("John", "Doe", 3333));
        stack.push(new Employee("Mike", "Kuntz", 4444)); 
        stack.push(new Employee("Bill", "End", 5555)); 
        
        stack.printStack();
        
        System.out.println(stack.peek()); 
        
        
        System.out.println("THIS IS THE OBJECT THAT GOT POPPED: "); 
        System.out.println("POPPED:" + stack.pop()); 
        
    }
    
    
    
}
