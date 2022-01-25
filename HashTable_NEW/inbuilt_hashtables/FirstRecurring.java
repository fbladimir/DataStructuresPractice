/* 
First reccuring number in an array 
//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]: It should return 2
//Given an array = [2,1,1,2,3,5,1,2,4]: It should return 1
//Given an array = [2,3,4,5]: It should return null
//Given an array = [2,5,5,2,3,5,1,2,4]: return 5 because the pairs are before 2,2
*/
package HashTable_NEW.inbuilt_hashtables;

import java.util.*; 


/**
 *
 * @author Franklin C.K
 */
public class FirstRecurring {
    
    private Integer firstRecurringCharacter(int[] array) { 
        
    HashSet<Integer> myHash = new HashSet<>(); 
        
        for (int a: array) { 
            
            if(myHash.contains(a)) { 
                return a; 
            } else { 
                myHash.add(a); 
            }
            
        }
        
        return null; 
        
    }
    
    public static void main(String[] args) { 
        
        FirstRecurring test = new FirstRecurring(); 
        
        int[] array = {2,5,1,2,3,5,1,2,4};
        int[] array2 = {2,1,1,2,3,5,1,2,4}; 
        int[] array3 = {2,3,4,5};
        int[] array4 = {2,5,5,2,3,5,1,2,4}; 
        
        System.out.println(test.firstRecurringCharacter(array4)); 
        
        
        
    }
    
    
}
