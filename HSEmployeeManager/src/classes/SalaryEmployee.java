package classes;
/**
* <h1>Application Name: HSEmployee Manager</h1>
* 
* <p>
* This is the  extended salaryEmployee from abstract employee class
* and this class will use abstract method of 
* calculatePay()
* 
* @author  Nadeem Akram
* @version 1.0
* @since   2018-11-01
*/
public class SalaryEmployee extends Employee {

	/** members variables */
	
private double monthlySalary;

/** Construct a salary employee object with name , address , ID and  */
	
	public SalaryEmployee(String name, String address, int id,  double salary) {
		super(name, address, id);
		this.monthlySalary = salary;
		
	}
	
	
	 @Override  /** abstract method calculate pay  */
     
	  public  double calculatePay() {
	    return monthlySalary;
	  }
	  

	


	
	
	
	
	
	
	 // getters and setters

	
	
	 
	 
	 
	 
	
	
}
