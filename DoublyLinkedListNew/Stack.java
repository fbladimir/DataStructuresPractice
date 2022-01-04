
package DoublyLinkedListNew;

/**
 *
 * @author Franklin C.K
 */
public class Stack {
    
    private int length; 
    private Node top; 
    private Node bottom;
    
    public Stack() { 
        length = 0; 
        top = null; 
        bottom = null; 
        
    }
    
    //peek() - return top value 
    public String peek() { 
        if (length > 0 ) { 
            return top.value; 
        } else { 
            return null; 
        }
    }
    
    //push() - add on top of stack 
    public void push(String value) { 
        Node newNode = new Node(value); 
        
        if (length == 0) { 
            top = newNode; 
            bottom = newNode; 
        } else { 
            newNode.next = top; 
            top = newNode;  
        }
        
        this.length++; 
    }
   
    //pop - remove top element in stack 
    public void pop() { 
        
        if (length > 0) { 
            top = top.next; 
            
            if (length == 1) { 
                bottom = null; 
            }
            
            length--; 
        }
        
    }
    
    //isEmpty() - checks if stack is empty 
    public boolean isEmpty() {  
        return length == 0; 
    }
    
    //getLastElement() - return bottom string 
    public String getLastElement() { 
        if (length < 0) { 
            return null; 
        } else { 
            return bottom.value; 
        } 
        
        
    }
    
    //this is wrong, fix
    public String[] printStack() { 
        String[] temp = new String[length]; 
        
        Node current = this.top; 
        
         
        for (int i = 0; i < this.length; i++) { 
            temp[i] = current.value; 
            current = current.next; 
            i++; 
        }
        
        return temp; 
    }
    
    
    public static void main(String[] args) { 
        
        Stack myStack = new Stack(); 
        
        myStack.push("Uno");
        myStack.push("dos"); 
        System.out.println(myStack.peek());
        myStack.pop(); 
        System.out.println(myStack.isEmpty()); 
        System.out.println(myStack.getLastElement()); 
    }
    
    
}
