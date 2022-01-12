/*
    Seletcion sort goes through the whole array and selects the lowest element and places it at index 0
 */
package algorithms.sorting.selection_sort;

import java.util.Arrays; 

/**
 *
 * @author Franklin C.K
 */

//Selection sort on this: 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 
//min = 0 
//j = 1 

//if 1 < min
//min = 1 

//take out first index 0 
//replace first index with min 
//replace min index with temp 
public class selectionSort {
    
    public int[] selectionSort(int[] array) { 
        
        for(int i = 0; i < array.length; i++) { 
            int min = i; 
            for (int j = i + 1; j < array.length; j++) { 
                if (array[j] < array[min]) { 
                    min = j; 
                }
            }
            int temp = array[i]; 
            array[i] = array[min]; 
            array[min] = temp; 
            
        }
        
        return array; 
    }
    
    public static void main(String[] args) { 
        selectionSort test = new selectionSort(); 
        
        int[] myArray = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0}; 
        
        System.out.println(Arrays.toString(test.selectionSort(myArray)));
    }
}
