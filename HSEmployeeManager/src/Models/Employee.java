package Models;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Employee {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private String EmployeeId;
	private String FirstName;
	private String LastName;
	private String Salary;
	private String Address;
	private String Phone;
	private String Email;
	private String BirthDate;
	private String StartDate;
	private String EndDate;
	private String City;
	private String Gender;
	private int Province;
	private int Title;
	private int Department;
	private int Status;


	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}



	public int getProvince() {
		return Province;
	}

	public void setProvince(int province) {
		Province = province;
	}

	public int getTitle() {
		return Title;
	}

	public void setTitle(int title) {
		Title = title;
	}

	public int getDepartment() {
		return Department;
	}

	public void setDepartment(int department) {
		Department = department;
	}



	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}


	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

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

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
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

	public Employee(String EmployeeId, String FirstName, String LastName, String Email,
					String Salary, int Title, int Department, String Address, String Phone,
					String Gender, String BirthDate, String StartDate, int Status, String EndDate, String City, int Province){

		this.EmployeeId = EmployeeId;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Salary = Salary;
		this.Title = Title;
		this.Department = Department;
		this.Address = Address;
		this.Phone = Phone;
		this.Gender = Gender;
		this.BirthDate = BirthDate;
		this.StartDate = StartDate;
		this.Status = Status;
		this.EndDate = EndDate;
		this.City = City;
		this.Province = Province;
	}

	public Employee(String EmployeeId, String FirstName, String LastName){
		this.id = id;
		this.EmployeeId = EmployeeId;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Salary = Salary;
		this.Title = Title;
		this.Department = Department;
		this.Address = Address;
		this.Phone = Phone;
		this.Gender = Gender;
		this.BirthDate = BirthDate;
		this.StartDate = StartDate;
		this.Status = Status;
		this.EndDate = EndDate;
		this.City = City;
		this.Province = Province;
	}

	public String toString(){
		return this.FirstName + " "+ this.LastName;
	}


}