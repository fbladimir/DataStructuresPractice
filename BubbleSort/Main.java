
package BubbleSort;

//Bubble sort is searching the first element in the array with the second and sorting it if it is greater than element to it's right. 

public class Main {

    
    public static void main(String[] args) {
        
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 }; 
        
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { 
            for (int i = 0; i < lastUnsortedIndex; i++) { 
                if (intArray[i] > intArray[i + 1]) { 
                    swap(intArray, i, i+1); 
                }
            } 
        }
        
        for (int i = 0; i < intArray.length; i++) { 
            System.out.println(intArray[i]); 
        }
        
    }
    
    public static void swap(int[] array, int i, int j) { 
        
        if (i == j) { //this is if the elements are the same, do nothing 
            return; 
        }
        
        int temp = array[i]; //temp stores this element 
        array[i] = array[j]; //array i is changed to array j element 
        array[j] = temp; // array j element has initial temp element 
        
        
    }
    
}
