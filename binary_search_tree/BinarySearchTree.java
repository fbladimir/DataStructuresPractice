
package binary_search_tree;

import java.util.ArrayList; 

/**
 *
 * @author Franklin C.K
 */
public class BinarySearchTree {
    
    Node root = null;
    
    //insert function 
    public void insert(int value) { 
        Node newNode = new Node(value); 
        
        if(this.root == null) { 
            this.root = newNode; 
        } else { 
            Node current = this.root; 
            while(true)  {
                //right 
                if (current.value < value) { 
                    if(current.right != null) { 
                        current = current.right; 
                    } else { 
                        current.right = newNode; 
                        break; 
                    }
                    
                    //left 
                    
                } else { 
                    if (current.left != null) { 
                        current = current.left; 
                        
                    } else { 
                        current.left = newNode; 
                        break; 
                    }
                }
            }
        }
    }
    
    //look up function 
    public boolean lookup(int value) { 
        Node current = this.root;
        
        while(current != null) { 
            if (current.value > value ) { 
                current = current.left; 
            } else if (current.value < value) { 
                current = current.right;  
            } else { 
                return true; 
            }
        }
        
            return false; 
    }
    
    
}
