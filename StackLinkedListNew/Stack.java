//stack using linkedList 

package StackLinkedListNew;

/**
 *
 * @author Franklin C.K
 */
public class Stack {
    
    private Node top; 
    private Node bottom; 
    private int length; 
    
    public Stack() { 
        top = null; 
        bottom = null; 
        length = 0; 
    }
    
    public String peek() { 
        if (length == 0) { 
            return null; 
        } else { 
            return top.value; 
        }
        
      
    }
    
    public boolean isEmpty() { 
        return length == 0; 
    }
    
    
    public void push(String value) { 
        Node newNode = new Node(value); 
        
        if (length == 0) { 
            top = newNode; 
            bottom = newNode; 
        } else { 
            newNode.next = top; 
            top = newNode;  
        }
        
        length++; 
    }
    
    public void pop() { 
        if (length == 1) { 
            top = null; 
            bottom = null; 
            
        } else { 
            top = top.next; 
            
        }
        
        length--; 
    }
    
    
    public static void main(String[] args) { 
        Stack myStack = new Stack(); 
        
        myStack.push("hello"); 
        myStack.push("okay");
        //System.out.println(myStack.peek()); 
        myStack.pop();
        System.out.println(myStack.peek()); 
    }
    
}
