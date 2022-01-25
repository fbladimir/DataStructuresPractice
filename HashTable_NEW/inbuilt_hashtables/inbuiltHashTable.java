

package HashTable_NEW.inbuilt_hashtables;

import java.util.*;  


/**
 *
 * @author Franklin C.K
 */
public class inbuiltHashTable {
    public static void main(String[] args) { 
        
    HashMap<String, String> phonebook = new HashMap<>(); 
    
    phonebook.put("Franklin", "32234232"); 
    phonebook.put("Tessie","323432323" ); 
    phonebook.put("Ronny", "4543543"); 
    
    System.out.println(phonebook); 
    
    //accessing enteries 
    System.out.println("Franklin's Phone Number: " + phonebook.get("Franklin")); 
    
   //deleting entry values 
   System.out.println("Removing Franklin"  + phonebook.remove("Franklin")); 
   
   //phonebook after removing Franklin
   System.out.println("New Phonebook: " + phonebook); 
    
  
    }
}
