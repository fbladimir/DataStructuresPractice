//bubbleSort: check left index with right index and if left > right, swap 

package algorithms.sorting.bubble_sort;

/**
 *
 * @author Franklin C.K
 */

import java.util.Arrays; 

public class BubbleSort {
    
    public int[] bubbleSort(int[] array) { 
        
        for(int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array.length-1; j++) { 
                //working with index j and j + 1 
                if (array[j] > array[j+1]) { 
                int temp = array[j]; 
                array[j] = array[j+1]; 
                array[j+1] = temp; 
                } 
            }
        }
        
        return array; 
    }
    
    
    public static void main(String[] args) { 
        
        BubbleSort bSort = new BubbleSort(); 
        
        int[] myArray = {8,10,23,13,1,12,4}; 
        
        System.out.println(Arrays.toString(bSort.bubbleSort(myArray))); 
    }
}
