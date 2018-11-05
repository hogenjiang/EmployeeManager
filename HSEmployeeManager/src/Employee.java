/**
* <h1>Application Name: HSEmployee Manager</h1>
* 
* <p>
* This is the abstract Employee class and it will extend HourrlyEmployee 
* and SaLaryEmployee classes and these classes will use abstract method of 
* calculatePay()
* 
* @author  Nadeem Akram
* @version 1.0
* @since   2018-11-01
*/
public abstract class Employee {
	
	/** members variables */
	
	 private int id;
	 private String firstName;
	 private String lastName;
	 private String phoneNumber;
	 private String address;
	 private java.util.Date dateHired;
	 private static int numberOfEmplyee = 0;
	 
	 /** Construct an employee object with name , address AND ID */
	 
	  public Employee(String name, String address, int id) {
	       dateHired = new java.util.Date();
	       this.lastName = name;
	       this.address = address;
	       this.id = id;
	       ++numberOfEmplyee; 
			 
			 }
	 
	 /** Return  first name */

	public String getFirstName() {
		return firstName;
	}


	/** Set a new first Name */
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/** Return last name */

	public String getLastName() {
		return lastName;
	}


	/** Set a new last name */
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/** Return id */
	
	public int getId() {
		return id;
	}


	/** Set a new id */

	public void id(int id) {
		this.id = id;
	}


	/** Return phone number */
	
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/** Set a new phone number */

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/** Return address */

	public String getAddress() {
		return address;
	}

	/** Set a new address */

	public void setAddress(String address) {
		this.address = address;
	}


	/** Return number of employee */
	
	public static int getNumberOfEmplyee() {
		return numberOfEmplyee;
	}


/** Return hire date */
	
	public java.util.Date getHiredDate(){
		return dateHired;
	}
	
	
	/** Abstract method calculatePay */
	
	public abstract double calculatePay();



	@Override
	public String toString() {
		return "Employee was hired on date " + getHiredDate();
	}
	 
 } 
		
