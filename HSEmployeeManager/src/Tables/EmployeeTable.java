package Tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.EmployeeDAO;
import Database.Const;
import Database.Database;
import ENUMS.Province;
import JavaBean.Employee;

public class EmployeeTable implements EmployeeDAO {
	
	Database db = Database.getInstance();
	ArrayList<Employee> employees;

	@Override
	public ArrayList<Employee> getAllEmplees() {
		// TODO Auto-generated method stub
		
		String query = "SELECT * FROM " + Const.TABLE_EMPLOYEE;
		employees = new ArrayList<Employee>();
		try {
		
			Statement getEmployees = db.getConnection().createStatement();
			ResultSet data = getEmployees.executeQuery(query);
			
			while(data.next()) {
				employees.add(new Employee(data.getInt(Const.EMPLOYEE_COLUMN_ID),
								   data.getString(Const.EMPLOYEE_COLUMN_FIRST_NAME),
								   data.getString(Const.EMPLOYEE_COLUMN_LAST_NAME),
								   data.getString(Const.EMPLOYEE_COLUMN_ADDRESS),
								   data.getString(Const.EMPLOYEE_COLUMN_CITY),
								   data.getString(Const.EMPLOYEE_COLUMN_PROVINCE),
								   data.getString(Const.EMPLOYEE_COLUMN_POSTAL_CODE),
								   data.getString(Const.EMPLOYEE_COLUMN_PHONE),
								   data.getString(Const.EMPLOYEE_COLUMN_EMAIL),
								   data.getString(Const.EMPLOYEE_COLUMN_HIRE_DATE),
								   data.getString(Const.EMPLOYEE_COLUMN_SALARY),
								   data.getInt(Const.EMPLOYEE_COLUMN_DEPARTMENT_ID)));
								   
								   
								  
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}
		
			
		
	

	@Override
	public Employee getEmployee(int ID) {
		String query = "SELECT FROM " + Const.TABLE_EMPLOYEE + " WHERE " +
				   Const.EMPLOYEE_COLUMN_ID + " = " + ID;
	Employee employee = new Employee();
	try {
		Statement getEmployee = db.getConnection().createStatement();
		ResultSet data = getEmployee.executeQuery(query);
		data.next();
		employee = new Employee(data.getInt(Const.EMPLOYEE_COLUMN_ID),
				   data.getString(Const.EMPLOYEE_COLUMN_FIRST_NAME),
				   data.getString(Const.EMPLOYEE_COLUMN_LAST_NAME),
				   data.getString(Const.EMPLOYEE_COLUMN_ADDRESS),
				   data.getString(Const.EMPLOYEE_COLUMN_CITY),
				   data.getString(Const.EMPLOYEE_COLUMN_PROVINCE),
				   data.getString(Const.EMPLOYEE_COLUMN_POSTAL_CODE),
				   data.getString(Const.EMPLOYEE_COLUMN_PHONE),
				   data.getString(Const.EMPLOYEE_COLUMN_EMAIL),
				   data.getString(Const.EMPLOYEE_COLUMN_HIRE_DATE),
				   data.getString(Const.EMPLOYEE_COLUMN_SALARY),
				   data.getInt(Const.EMPLOYEE_COLUMN_DEPARTMENT_ID));
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return employee;
	}

	@Override
	public void updateEmployee(Employee Employee) {
		String query = "UPDATE " + Const.TABLE_EMPLOYEE + " SET " +
				Const.EMPLOYEE_COLUMN_FIRST_NAME + " " + Employee.getFirstName() +  "," +
				Const.EMPLOYEE_COLUMN_LAST_NAME + " " + Employee.getLastName() +  "," +
				Const.EMPLOYEE_COLUMN_ADDRESS + " " + Employee.getCity() + "," +
				Const.EMPLOYEE_COLUMN_PHONE + " " + Employee.getPhone() +
		         " WHERE " + Const.EMPLOYEE_COLUMN_ID + " = " + Employee.getEmployeeId();
			try {
				Statement updateItem = db.getConnection().createStatement();
				updateItem.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	

	@Override
	public void deleteEmployee(Employee Employee) {
		
		
		
		String query  = "DELETE FROM " + Const.TABLE_EMPLOYEE + " WHERE " +
				Const.EMPLOYEE_COLUMN_ID + " = " + Employee.getEmployeeId();
try {
	db.getConnection().createStatement().execute(query);
	System.out.println("Deleted record");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}

	@Override
	public void createEmployee(Employee Employee) {
		String query = "INSERT INTO " + Const.TABLE_EMPLOYEE +
				   "(" + Const.EMPLOYEE_COLUMN_FIRST_NAME + ", " +
				   Const.EMPLOYEE_COLUMN_LAST_NAME + ", " +
				   Const.EMPLOYEE_COLUMN_ADDRESS + ", " +
				   Const.EMPLOYEE_COLUMN_CITY + ", " +
				   Const.EMPLOYEE_COLUMN_PROVINCE + ", " +
				   Const.EMPLOYEE_COLUMN_POSTAL_CODE + ", " +
				   Const.EMPLOYEE_COLUMN_PHONE + ", " +
				   Const.EMPLOYEE_COLUMN_EMAIL + ", " +
				   Const.EMPLOYEE_COLUMN_LAST_NAME + ", " +
				   Const.EMPLOYEE_COLUMN_HIRE_DATE + "," + 
				   Const.EMPLOYEE_COLUMN_SALARY + "," + 
				   Const.EMPLOYEE_COLUMN_DEPARTMENT_ID + "," + ") VALUES ('" +
				   Employee.getFirstName() + "','" +  Employee.getLastName() + "','" + Employee.getAddress() + "','" +  Employee.getCity() +  Employee.getProvince() + "','" + Employee.getProvince() +  Employee.getPostalCode() + Employee.getHireDate() +  Employee.getSalary() + Employee.getDepartmentId() + "','" + 
				  
				   "')";
	try {
		db.getConnection().createStatement().execute(query);
		System.out.println("Inserted Record");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
