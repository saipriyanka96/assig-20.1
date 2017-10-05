package hashmap;
//Package is a grouping of related types providing access protection and name

import java.util.HashMap;
import java.util.Iterator;

public class GenericHashMap 
//public keyword is used in the declaration of a class,method or 
	//field;public classes,method and fields can be accessed by the 
	//members of any class.
	//class defines instance and class fields,methods and inner classes as
	//well as specifying the interfaces the class implements and the 
	//immediate superclass of the class
{
	public static void main(String[] args) {
		//static is used for memory management
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
				
		// TODO Auto-generated method stub
		//HashMap class implements the map interface by using a hash 
		//table. It inherits AbstractMap class and implements Map 
		//interface.HashMap<k,v>
		//K: It is the type of keys maintained by this map.
		//V: It is the type of mapped values.
		HashMap<Integer,String> employeeNames=new HashMap<Integer,String>();
		//put(K key, V value) method is used to associate the specified 
		//value with the specified key in this map.
		employeeNames.put(1,"Priya");
		 employeeNames.put(2,"Meera");
		 employeeNames.put(3,"Anika");
		 employeeNames.put(4,"Gauri");
		
		//system is final class
	     //out is a static member of system class and type printStream
	     //println is method of printStream class.ln means nextline
	    
		System.out.println("Employees are:");
		
	//creating the values and iterating
		Iterator valueIterator= employeeNames.values().iterator();
//hasNext() method Returns true if this scanner has another token in its input. 
		while(valueIterator.hasNext())
		{
			System.out.println(valueIterator.next());	
			//system is final class
		      //out is a static member of system class and type printStream
		      //println is method of printStream class.ln means nextline
		    
		
		}
		  
	}

}
