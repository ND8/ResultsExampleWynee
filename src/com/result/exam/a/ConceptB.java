package com.result.exam.a;

//this import contains all the use of the java util imports so minimised the imports labelled for use of set, hashset and iterator import
import java.util.*;
	
	//conceptB is a subclass of ConceptA
	public class ConceptB extends ConceptA {
	
	public ConceptB( final String anId, final Concept aParent )		//constructor parameters are now final to state these parameter values will be used.
	  {
	    super( anId, aParent );
	    
	  }  
	
	  //private Set<Concept> children changed to simplify the use of the hashset and the children object that was created
	  // if values are known, the hashset object can be used to simplify the code by children.add("values") , children.remove("values") and iterate.
	  private HashSet<Concept> children = new HashSet<Concept>();			
	  
	  public int getCount()
	  {
	    return children.size();         //The size() method is used to get the number of elements in this set.
	  }
	  
	  
	//changed from void to boolean and returned a value
	  public boolean addChild( Concept aChild )	 //this method adds to the hashset	and returns the aChild			
	  {
	    return children.add( aChild );								
	  }
	  
	  
	//changed from void to boolean and returned a value
	  public boolean removeChild( Concept aChild )		//this method removes aChild from the hashset		
	  {
	    return children.remove( aChild );
	  }
	
	  public Iterator<Concept> getChildren()		//The iterator() method is used to get an iterator over the elements in this set. The elements are returned in no particular order.this method iterates through each child
	  {
	    return children.iterator();
	  }
	
	  public int getFamilySize()
	  {
	    int count = getCount();				//changed to getCount() which contains children.size()
	
	    for ( Iterator<Concept> iter = getChildren(); iter.hasNext(); )  // the object created iter is equal to the value returned in the getChildren method
	    {																//this iterator could possibly be removed and turned this into a for each loop. this would remove the need to get the size first.
	      count += ( (ConceptB) iter.next() ).getFamilySize();
	    }
	
	    return count;
	  }
	
	  public int getAncestorCount()
	  {
	    int count = 0;
	    
	    //creating an object from superclass that contains the get parent method so it may be used to call within the while loop
	    Concept ancestor = getParent();
	
	    //while the ancestor is not null
	    while ( ancestor != null )
	    {
	    	
	      count++; //increases the count by 1 each time whilst it goes through the loop
	      if ( ancestor instanceof ConceptA )
	      {
	        ancestor = ( (ConceptA) ancestor ).getParent(); // the ancestor will be equivalent to value from getParent method
	      }
	      else //if the if statement is not true then the ancestor is returned as null
	      {
	        ancestor = null;
	      }
	    }
	
	    //the loop then returns the count
	    return count;
	  }
	  
	  
	   public String toString()			// @Override overrides this method as well as the same method in Concept and conceptA, method overriding occurs here 
	  {												//so that this toString() method can return the additional values of children size along with id and parent. 
	    return "ConceptB{" + getId() + ", parent=" + getParent() + ", children=" + children.size() + "}";
	  }
	}
