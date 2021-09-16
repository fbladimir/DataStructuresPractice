/* selection sort 
1. Create for loop that starts at 6 which is the last element in the array 
2. Create another for loop that starts at i = 1 which compares i to the largest element 0 and swap if i greater than 0 and assign 
largest to that element 
3. Once it reaches end second for loop array switch largest with the last unsortedIndex(first for loop) 
*/ 


package SelectionSort;


public class Main {
    
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
        
        //this is just to print out the array 
        for (int i = 0; i < myArray.length; i++ ) { 
            System.out.println(myArray[i]); 
        }
    }
    
    public static void swap(int[] array, int i, int j) { 
        
        if (i == j) { 
            return; 
            
        }
        
        int temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp; 
        
    }
    
    
    
}
