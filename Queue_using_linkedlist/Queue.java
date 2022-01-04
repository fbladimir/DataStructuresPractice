//queue using linkedlist 


package Queue_using_linkedlist;

/**
 *
 * @author Franklin C.K
 */
public class Queue {
    
    Node first = null; 
    Node last = null;
    int length = 0; 
 
    
    
 
   
    
    public String peek() { 
        if (this.length > 0) { 
            return this.first.value; 
        } else { 
            return null; 
        }
       
    }
    
    public void enqueue(String value) { 
        Node newNode = new Node(value); 
        
        
        if (this.length == 0) { 
            this.first = newNode;  
        } else { 
            this.last.next = newNode; 
        } 
            this.last = newNode; 
            this.length++; 
        
    }
    
    public void dequeue() { 
        if (this.length == 1) { 
            this.first = null; 
            this.length--; 
        } else { 
            this.first = this.first.next; 
           
        }
        
         this.length--; 
    }
    
    public boolean isEmpty() { 
        return this.length == 0; 
        }
    
    public static void main(String[] args) { 
        
        Queue myQ = new Queue(); 
        myQ.enqueue("FirstGuy");
        myQ.enqueue("SecondGuy"); 
        myQ.enqueue("ThirdGuy");
        myQ.dequeue(); 
        myQ.dequeue(); 
        System.out.println(myQ.peek());  
        
    
    }
} 
