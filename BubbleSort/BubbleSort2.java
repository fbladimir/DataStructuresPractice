//bubbleSort -- Check left element with right element if it is bigger then use swap method. 
//same code I just rewrote it. 
package BubbleSort;

public class BubbleSort2 {
    
    
    public static void main(String[] args) {
    
        int[] myArray = {5, 30, -15, 20, 9, 10}; 
        
        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { 
            for (int i = 0; i < lastUnsortedIndex; i++) { 
                if (myArray[i] > myArray[i + 1]) { 
                    swap(myArray, i, i+1); 
                }
            }
        }
    
    }
      


public static void swap(int[] array, int i, int j ) {
    
    if( i == j) { 
        return; 
    }
    
    int temp = array[i]; 
    array[i] = array[j]; 
    array[j] = temp; 
    
    }

} 
