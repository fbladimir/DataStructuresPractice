
package LinkedListNew;

 

/**
 *
 * @author Franklin C.K
 */

//methods to create: append, preprend, getLength, printList, insert, remove, reverse,
//missing remove and reverse 
public class SingleLinkedList {
    
    private Node head; 
    private Node tail; 
    private int length; 
    
    public SingleLinkedList(int value) { 
        head = new Node(value); 
        tail = head; 
        length = 1; 
    }
    
    public void append(int value) { 
        Node newNode = new Node(value); 
        tail.next = newNode; 
        tail = newNode; 
        length++;
    }
    
    public void prepend(int value) { 
        Node newNode = new Node(value); 
        newNode.next = newNode; 
        head = newNode; 
        length++; 
    }
    
    public int getLength() { 
        return length; 
    }
    
    
    public int[] printList() { 
        int[] myList = new int[length]; 
        Node current = this.head; 
        int i = 0; 
        
        while(current != null) { 
            myList[i] = current.value; 
            current = current.next; 
            i++; 
        }
        
        return myList; 
    }
    
    public void insert(int index, int value) { 
        if (index < 0 || index > length ) { 
            System.out.println("invalid index"); 
        } else if (index == 0) { 
            prepend(value); 
        } else if (index == length) { 
            append(value); 
        } else { 
            Node current = head; 
            for (int i = 0; i < index - 1; i++) { 
                current = current.next; 
            }
            
            Node newNode = new Node(value); 
            newNode.next = current.next; 
            current.next = newNode; 
            length++; 
        }
    }
    
    
    
    
 
    
}
