package colections;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

	public class TesteTreeSet {  
		  
		   /** 
		    * @param args 
		    */  
		   public static void main(String[] args) {  
		      // TODO Auto-generated method stub  
		  
		      Collection set = new TreeSet();  
		        
		        
		      for (int i=1;i<1001;i++){  
		           
		         boolean add = set.add(new Integer(i));  
		      }  
		      //  
		        for (Iterator iter = set.iterator(); iter.hasNext();) {  
		           Integer inte = (Integer) iter.next();  
		           System.out.println("volta --> "+inte);  
		     
		        }        
		        
		      //  
		   }  
		  
		}
