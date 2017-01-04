package com.result.exam.a;

	public class Concept
	{
	  private String id;   				//class variable created because so it can be called in different methods
	  																	//it is a null pointer exception because the object must always hold a value and never be null so a exception can be thrown to catch error.
	  protected Concept( String anId )	throws NullPointerException		//constructor with one parameter which throws an exception
	  {
		  
		  if (anId != null ) {						//iff the Id is not null then anId will be set to the object Id					
			  this.id = anId;						////changed to this.id from id = anId because Id object is private so calls it specifically inside the constructor
		  }
	  else //added an else statement to the if. if the if statement does not meet the requirments the else statement will throw an exception
	    {
	      throw new NullPointerException( "id must not be null" );			//changed NullPointerException to that <--
	    } 			//changed to this.id from id = anId because Id is current object instance reference
	  }
	
	  public String getId()		//getters and setters for the variable ID
	  {
	    return id;
	  }
	
	  public void setId( String id )  		//sets the Id
	  {						
	    this.id = id;						//because Id variable isnt final changed to this.id from id = id also because the variable is called in a different method
	  }
	
	  public boolean equals(Concept con)			//changed (Object object) to (Concept con)
	  {
		  //if object is not null and the class is equal whilst the id is also the same then it will return a true
	    return con != null && con.getClass().equals(getClass()) && id.equals(con.id);  // changed ((Concept) con) to just the object con
	  }
	
	 public String toString()						//this method will be overridden in the subclasses
	  {
		 											//this returns to the Id value
	    return "Concept(" + id + ")";				//could change "Concept(" + id + ")" to get.Id() from concept method or also change it to return String.format(getId());	 
	  }
	}
