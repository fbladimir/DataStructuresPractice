//ex 
//6: 6 * 5 * 4 * 3 * 2 * 1 
//or 6: 6 * 5! 
package algorithms.recursion.factorial;

/**
 *
 * @author Franklin C.K
 */
public class factorial {
    
   //recursive approach 
    
    public int findFactorialRecursive(int value) { 
        if (value < 2) { 
            return 1; 
        } 
        
        return value * findFactorialRecursive(value - 1); 
    }
    
    
    
    //iterative approach
    
    public int findFactorialIterative(int value) { 
        if (value < 2 ) { 
            return 1; 
        }  
            int answer = 1; 
            
            for (int i = 2; i <= value; i++) { 
                answer = answer * i; 
            }
            
            return answer; 
    } 
             
    
    
    public static void main(String[] args) { 
        
        
        factorial factorial = new factorial(); 
        
        System.out.println("Recursive approach: "); 
        System.out.println(factorial.findFactorialRecursive(6)); 
        
        System.out.println("Iterative approach: "); 
        System.out.println(factorial.findFactorialIterative(6)); 
        
        
    }
       
       
        
    
}
