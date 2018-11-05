/**
* <h1>Application Name: HSEmployee Manager</h1>
* 
* <p>
* This is the  extended HourrlyEmployee from abstract employee class
* and this class will use abstract method of 
* calculatePay()
* 
* @author  Nadeem Akram
* @version 1.0
* @since   2018-11-01
*/

public class HourlyEmployee extends Employee  {
	
	/** members variables */
	
	  private double salaryRate;            
	  private double hours;        

/** Construct an hourly employee object with name , address , ID and  */
	  
		  public HourlyEmployee(String name, String address, int id,  double salary) {
			  super(name, address, id);
		   salaryRate = salary;
		    hours = 0.0;
		  }
		  
		  
		  /** reset hours  */
		  
		  public void resetHours() {
		    hours = 0.0;
		  }
		  
		  
		   /** add  hours  */
		  
		  public void addHours(double newHours) {
		    hours = hours + newHours;
		  }
		  
		  
		  @Override  /** abstract method calculate pay  */
		                         
		  public  double calculatePay() {
		    if (hours <= 40.0) {
		      return salaryRate * hours;
		    } else {
		      return salaryRate* 40.0 + 1.5* salaryRate*(hours - 40.0);
		    }
		  }
		  
		  
		  /** return a string method */
		  
		  public String toString() {
		    return "HourlyEmployee(name = " + getFirstName() + ", id = " + getId() +
		      ", hourly pay = " + salaryRate + ", hours worked = " + hours + ")";
		  }
		  
		
		  
		  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
