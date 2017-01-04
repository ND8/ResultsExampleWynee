package com.result.exam.a;

	public class ConceptA extends Concept		//this class inherits from the superclass which is Concept all the members (fields, methods, and nested classes) can be used within this class
	{
	  private final Concept parent; 			//instance variable with final so you cannot change the value of final variable It will be constant.
	
	  public ConceptA( String anId, Concept aParent )			//constructor of class ConceptA with an additional parameter of aParent
	  {
	    super(anId);							//super method calls from parent class Concept with and must be first inside the constructor
	    this.parent = aParent; 					//this. added to reference the current object
	  }
	
	  public Concept getParent()		// method to contain additional method information
	  {
	    return parent;
	  }
	
	   public String toString()					//same method in all classes, will be overriden by same method in ConceptB class
	  {
	    return "ConceptA{" + getId() + ", parent=" + parent + '}'; 			//could change to String.format(getId(), getParent()); 
	  }
	}
