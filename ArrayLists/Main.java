/* 
Array Lists -- 

*/
package ArrayLists;

import java.util.ArrayList;
import java.util.List; 

public class Main {
    
    public static void main(String[] args) { 
        
        List<Employee> employeeList = new ArrayList<>(); 
        
        employeeList.add(new Employee("Jane", "Jones", 123)); 
        employeeList.add(new Employee("John", "Doe", 4567)); 
        employeeList.add(new Employee("Mary", "Smith", 22)); 
        employeeList.add(new Employee ("Mike", "Wilson", 3245)); 
        
        employeeList.forEach(employee -> System.out.println(employee)); //this just prints out employees from above. 
        
        System.out.println(employeeList.get(1)); // This prints out john from employees
        
        //check to see if list is empty 
        
        System.out.println(employeeList.isEmpty()); //this would return false. 
        
        //replace employee index with new information 
        employeeList.set(1, new Employee("John", "Adams", 4568)); 
        
        
        // get size of list 
        System.out.println(employeeList.size()); 
        
        employeeList.add(3, new Employee("John", "Doe", 4567)); 
        
        //instead of having them on a list, have them in array 
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]); 
        
        for (Employee employee: employeeArray) { 
            System.out.println(employee); 
        }
        
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22))); //Reason this is false is because there is no equal method implementaiton 
        
        //I tested out it without equals method and without, after adding the above statement is true. 
        
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567))); // this will return true
        
        //how to remove 
        
        employeeList.remove(2); // this will remove index 2 
        
        
    }
    
    
}
