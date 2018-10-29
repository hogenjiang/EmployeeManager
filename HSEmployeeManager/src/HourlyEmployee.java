
public class HourlyEmployee extends Employee  {
	
	
	
		// salary  per hour
		private double wage; 
		
		// Number of weeks per hour
		 private double hours; 
	
	
	
	
	public HourlyEmployee(String firstName, String lastName, String socialInsuranceNumber) {
		super(firstName, lastName, socialInsuranceNumber);
		
	}


	// getters and setters


	public double getWage() {
		return wage;
	}




	public void setWage(double wage) {
		this.wage = wage;
	}




	public double getHours() {
		return hours;
	}




	public void setHours(double hours) {
		this.hours = hours;
	}




	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + "]";
	}





	
	

	 
	

	 
	 
	
	  
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
