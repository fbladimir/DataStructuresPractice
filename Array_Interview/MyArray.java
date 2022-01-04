
package Array_Interview;

import java.util.Arrays; 
import java.util.ArrayList; 

/**
 *
 * @author Franklin C.K
 */

public class MyArray {
    
    private Object[] data; 
    private int capacity; 
    private int length; 
    
    public MyArray() { 
        
        data = new Object[1]; 
        capacity = 1; 
        length = 0; 
        
    }
    
    public Object get(int index) { 
        return data[index]; 
    }
    
    public void push(Object obj) { 
        if (capacity == length) { 
            data = Arrays.copyOf(data, capacity*2); 
            capacity *= 2; 
        }
        
        data[length] = obj; 
        length++; 
    }
    
    public Object pop() { 
        Object poppedItem = data[length-1]; 
        return poppedItem; 
        
    }
    
    public Object delete(int index) { 
        Object deletedItem = data[index]; 
        shiftItems(index); 
        
        return deletedItem; 
    }
    
    public void shiftItems(int index) { 
        for(int i = index; i < length-1; i++) { 
            data[i] = data[i+1]; 
            
        }
        
        data[length-1] = null; 
        length--; 
    }
    
    public static void main (String[] args) { 
        MyArray me = new MyArray(); 
        
        me.push("10"); 
        me.push("9"); 
        me.push("8"); 
        
        for (int i = 0; i < me.length; i++) { 
            System.out.println(me.get(i)); 
        }
    }
   
}
