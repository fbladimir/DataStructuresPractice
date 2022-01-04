//another way of implementing a dynamic array 



package Array_Interview;

import java.util.Arrays; 
import java.util.ArrayList; 


/**
 *
 * @author Franklin C.K
 */

public class MyArray2 {
    
    //store elements 
    private String[] array; 
    
    
    //capacity is number of elements that the array can hold 
    private int capacity; 
    
    //length of array 
    private int length; 
    
    public MyArray2() { 
        
        array = new String[1]; 
        capacity = 1; 
        length = 0; 
        
    }
    
    //get method returns the element of the array at the given index 
    
    public String get(int index) { 
        if (index > -1 && index < length) 
            return this.array[index];
        else return "Index out of bound"; 
        
    }
    
    // 0 1 2 3 4 5 we want to add 6 to the end. 
    
    //push() method adds an element at the end 
    public void push(String string) { 
        //if current length becomes equal to capacity we need to make array bigger 
        if (length == capacity) { 
            //create new array with double capacity 
            String[] tempArray = new String[2*capacity]; 
            
            //copy elements of old array into new array 
            for (int i = 0; i < array.length; i++) { 
            tempArray[i] = array[i]; 
            } 
            
            //newly created array as our real array 
            array = tempArray; 
            
            //update capacity 
            capacity *= 2; 
            }
        
        //insert element at the end 
        array[length] = string; 
        
        //update length by 1
        length++; 
    }
    
    
    //replace (index,value) replaces value at given index with new entered value 
    public void replace(int index, String value) { 
       
        if (index > -1 && index < length){ 
           array[index] = value;  
        } else 
            System.err.println("Index out of bounds"); 
    }
    
    //remove last element 
    public void pop() { 
        if(length > 0) { 
        length--; 
        } 
    }
    
    //delete element at given index 
    public void delete(int index) { 
         if (index > -1 && index < length) { 
             if (index == length-1) { 
                 pop(); 
             } else { 
                 for (int i = index; i < length;  i++) { 
                     array[i] = array[i+1]; 
                     
                 }
                 
                 length--; 
             }
             
         } else { 
             System.err.println("Index is out of bounds");
             
             
         }    
    }
    
    
    //get array 
    public String[] getArray() { 
        String[] tempArr = new String[length]; 
        
        for (int i = 0; i < length; i++) { 
            tempArr[i] = array[i]; 
        }
        
        return tempArr; 
    }
    
    //returns length of array{number of elements in the array} 
    public int length() { 
        return length; 
    }
    
    
    public static void main(String[] args) { 
        
        MyArray2 array = new MyArray2();
        array.push("hi");
        array.push("goodbye"); 
        array.push("oh no"); 
        array.push("love"); 
        array.pop(); 
        
        for (int i = 0; i < array.length; i++) {

            System.out.println(array.get(i)); 
        }
    }
    
       
}
