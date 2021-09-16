//selection sort my own code 
//assign largest 0 and compare it with array[i] which is 1 and assign to largest if it is greater than 
package SelectionSort;


public class SelectionSort2 {
    
    public static void main (String[] args) { 
        
        int[] myArray = { 20, 35, -15, 7, 55, 1, -22}; 
        
        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { 
            
            int largest = 0; 
             
            for (int i = 1; i <= lastUnsortedIndex; i++) { 
                
                if (myArray[i] > myArray[largest]) { 
                    largest = i; 
                }
            }
            
            swap(myArray, largest, lastUnsortedIndex); 
        }
        
        for (int i = 0; i < myArray.length; i++) { 
            System.out.println(myArray[i]); 
        }
        
    }
    
    public static void swap(int[] array, int i, int  j ) { 
        
        if (i == j) { 
            return; 
        }
        
        int temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp; 
        
        
    }
}
