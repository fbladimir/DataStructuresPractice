// reverse a string method 


package Array_Interview;

/**
 *
 * @author Franklin C.K
 */
public class ReverseString {

    
    public static String ReverseString(String string) { 
        
        String result = ""; 
        final int length = string.length(); 
        
        for (int i = length - 1; i >= 0; i--) { 
            
            result += string.charAt(i); 
        }
        
        return result; 
        
 
    }
    
    public static String ReverseStringWithReel(String string) { 
        
        return new StringBuilder(string).reverse().toString(); 
    }
    
    
    public static void main(String[] args) { 
        
        System.out.println(ReverseString("Hello")); 
        System.out.println(ReverseStringWithReel("Goodbye")); 
        
    }
}
