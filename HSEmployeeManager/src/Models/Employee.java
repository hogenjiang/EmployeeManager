package Models;


public class Employee {
	private String EmployeeId;
	private String FirstName;
	private String LastName;
	private String SIN;
	private String Salary;
	private String Title;
	private String Department;
	private String Address;
	private String Phone;
	private String Email;
	private String Gender;
	private String Status;
	private String BirthDate;
	private String StartDate;
	private String EndDate;
	private String City;
	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	private String Province;
	private String PostalCode;
	


	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSIN() {
		return SIN;
	}

	public void setSIN(String SIN) {
		this.SIN = SIN;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public Employee(String EmployeeId, String FirstName, String LastName, String SIN, String Salary, String Title, String Department, String Address, String Phone, String Email,
					String Gender, String Status, String BirthDate, String StartDate, String EndDate, String City, String Province, String PostalCode){

		this.EmployeeId = new String(EmployeeId);
		this.FirstName = new String(FirstName);
		this.LastName = new String(LastName);
		this.SIN = new String(SIN);
		this.Email = new String(Email);
		this.Salary = new String(Salary);
		this.Title = new String(Title);
		this.Department = new String(Department);
		this.Address = new String(Address);
		this.Phone = new String(Phone);
		this.Gender = new String(Gender);
		this.BirthDate = new String(BirthDate);
		this.StartDate = new String(StartDate);
		this.Status = new String(Status);
		this.EndDate = new String(EndDate);
		this.City = new String(City);
		this.Province = new String(Province);
		this.PostalCode = new String(PostalCode);

	}


//	public Employee(int id, int employeeId, String firstName, String lastName, int SIN, Image profile, int salary, String title, String department, String address, String phone, String email,
//					String gender, String status, String birthDate, String startDate, String endDate){
//		this.id = id;
//		this.employeeId = employeeId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.SIN = SIN;
//		this.profile = profile;
//		this.email = email;
//		this.salary = salary;
//		this.title = title;
//		this.department = department;
//		this.address = address;
//		this.phone = phone;
//		this.gender = gender;
//		this.birthDate = birthDate;
//		this.startDate = startDate;
//		this.status = status;
//		this.endDate = endDate;
//
//	}


}