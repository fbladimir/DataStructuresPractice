/* Insertion Sort -- sorts from left to right 
 Does not need swap method, here we are shifting elements. 

1. Start firstUnsortedIndex = 1 
2. Start i = 0 
3. Assign newElement = firstUnsortedIndex 


*/
package InsertionSort;

public class Main {
    
    public static void main(String[] args) { 
        
        int[] myArray = { 20, 35, -15, 7, 55, 1, -22}; 
        
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length; firstUnsortedIndex++) { 
            int newElement = myArray[firstUnsortedIndex]; 
            
            int i; 
            
            for ( i = firstUnsortedIndex; i > 0 && myArray[i-1] > newElement; i--) { 
                myArray[i] = myArray[i-1]; 
            }
            
            myArray[i] = newElement; 
            
            
        }
        
        for (int i = 0; i < myArray.length; i++) { 
            System.out.println(myArray[i]); 
        }
        
        
    }
    
  
    
    
}
