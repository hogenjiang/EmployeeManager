package JavaBean;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String province;
	private String postalCode;
	private String phone;
	private String email;
	private String hireDate;
	private String salary;
	private int departmentId;
	
	
	
	public Employee() {
		
	}
	
public Employee(String firstName) {
	
		
		this.lastName = lastName;
	}



	public Employee(int employeeId, String firstName, String lastName, String address, String city, String province,
			String postalCode, String phone, String email, String hireDate, String salary, int departmentId) {
	
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.phone = phone;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
		this.departmentId = departmentId;
	}



	public Employee(String firstName, String lastName, String address, String city, String province, String postalCode,
			String phone, String email, String hireDate, String salary, int departmentId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.phone = phone;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
		this.departmentId = departmentId;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getProvince() {
		return province;
	}



	public void setState(String state) {
		this.province = province;
	}



	public String getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getHireDate() {
		return hireDate;
	}



	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}



	public String getSalary() {
		return salary;
	}



	public void setSalary(String salary) {
		this.salary = salary;
	}



	public int getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}



	
	
	public String toString() {
		return this.firstName + " | " + this.lastName + " | " + this.salary;
	}
	
	
	
	
	
	
	
	
	
	
	

}
