
package Reverse_String;

/**
 *
 * @author Franklin C.K
 */
public class reverseString {
    
    //reverse "Hello" to "olleH" using 2 methods 
    
    //method 1
    
    public String reverse(String string) { 
        
        String temp = ""; 
        
        for (int i = string.length() - 1; i >= 0; i--) { 
            temp = temp + string.charAt(i); 
        }
        
        return temp; 
        
    }
    
    //method 2 
    public String reverse2(String string) { 
        
        StringBuilder temp = new StringBuilder(); 
        
        for (int i = string.length() - 1; i >= 0; i--) { 
            
            temp.append(string.charAt(i));  
            
        }
        
        return temp.toString(); 
        
        
    }
    
    
    public static void main(String[] args) { 
        
        
        reverseString reverseString = new reverseString(); 
        String greet = "Hello"; 
        
        System.out.println("METHOD 1 to reverse string"); 
        System.out.println(reverseString.reverse(greet)); 
        
        System.out.println("METHOD 2 to reverse string "); 
        System.out.println(reverseString.reverse2(greet)); 
        
    }
}
