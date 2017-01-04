package com.result.exam.a;
	
//this class couldve been avoided and placed the implementation within the ConceptA class.
//the constructor in ConceptA class couldve taken an additional parameter of serialNo and all other implementation within this class couldve have been coded correctly in ConceptA
public class ConceptC extends ConceptA				//this class is the subclass of ConceptA and inherits all methods variables etc
	{
	  private static int nextSerialNo = 0;			//class variable has been declared and given a value of 0 and is also static so is associated with a class not object of a class
	
	  public static int getNextSerialNo() 					
	  {
	    return nextSerialNo++; 			//every time this method is called will increment the variable by 1
	  }
	
	  private final int serialNo;				//this is another class variable declared private and final so can not be changed
	
	  public ConceptC( String anId )			//constructor with 1 parameter 	
	  {
	    super( anId, null );				//super method which calls from Concept A, it contains the parameters within that constructor
	
	    serialNo = getNextSerialNo();		// this indicates that the final variable is equivalent to the getNextSerialNo() method which will increment the serialNo by 1.
	  }
	
	  public int getSerialNo() 					//getter of SerialNo which returns a value incremented by 1
	  {
	    return serialNo;
	  }
	
	  @Override								//this annotation will overirde all other methods in the other classes and run this method
	  public String toString()
	  {
	    return "ConceptC(" + getId() + ", " + serialNo + getParent() + ")";   // also added getParent() method from ConceptA;
	  }
	}