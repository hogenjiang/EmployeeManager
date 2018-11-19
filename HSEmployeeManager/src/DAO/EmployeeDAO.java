package DAO;

import java.util.ArrayList;

import JavaBean.Employee;


public interface EmployeeDAO {
	
	
	
	
		
		public ArrayList<Employee> getAllEmplees();
		public Employee getEmployee(int ID);
		public void updateEmployee(Employee Employee);
		public void deleteEmployee(Employee Employee);
		public void createEmployee(Employee Employee);
	}






	