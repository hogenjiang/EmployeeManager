
public abstract class Employee {
	
	 private  String firstName;
	 private  String lastName;
	 private  String socialInsuranceNumber;
	 private String phoneNumber;
	 private String address;
	 private static int numberOfEmplyee = 0;
	 
	 
	 
	 public Employee(String firstName, String lastName,
			  String socialInsuranceNumber) {
			 this.firstName = firstName;
			 this.lastName = lastName;
			 this.socialInsuranceNumber = socialInsuranceNumber;
			 ++numberOfEmplyee; 
			 
			 }
	 
	 
	 
	// getters and setters



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getSocialInsuranceNumber() {
		return socialInsuranceNumber;
	}



	public void setSocialInsuranceNumber(String socialInsuranceNumber) {
		this.socialInsuranceNumber = socialInsuranceNumber;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public static int getNumberOfEmplyee() {
		return numberOfEmplyee;
	}



	public static void setNumberOfEmplyee(int numberOfEmplyee) {
		Employee.numberOfEmplyee = numberOfEmplyee;
	}



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	 
	 
	

	
	
		
		 } 
		
