/*
 Start at first index 0, if array[0] < array[0 + 1] then swap
then continue comparing the next element with previous elements. 

 */
package algorithms.sorting.insertionsort;

import java.util.ArrayList; 
import java.util.Arrays; 

/**
 *
 * @author Franklin C.K
 */
public class insertionSort {
     // numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
    
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0)); 
    
    public ArrayList<Integer> insertionSort(ArrayList<Integer> array) { 
        for (int i = 0; i < array.size(); i++) { 
            // if number less than 1st number. then move it at the start of the array 
            if (array.get(i) <= array.get(0)) { 
                array.add(0, array.remove(i)); 
            } else { 
                //check where should the number be placed and move it. 
                if(array.get(i) < array.get(i-1)) { 
                    for (int j = 1; j < i; j++) { 
                        if (array.get(i) < array.get(j)) { 
                            array.add(j, array.remove(i)); 
                            //end inner loop after element moved 
                            break; 
                        }
                    }
                }
            }
        }
        return array; 
    }
    
    public static void main(String[] args) { 
        insertionSort test = new insertionSort(); 
        
        System.out.println(test.insertionSort(test.numbers)); 
    }
}
