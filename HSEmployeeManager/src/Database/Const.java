package Database;

public class Const {
	public static final String DB_NAME = "nakramdb";
	public static final String DB_USER = "nakram";
	public static final String DB_PASS = "219bn219bnzmxxxzmxxx";
	//Create a constant for each of the table and column names
	
	public static final String TABLE_EMPLOYEE = "employee";
	public static final String EMPLOYEE_COLUMN_ID = "employeeId";
	public static final String EMPLOYEE_COLUMN_FIRST_NAME = "firstName";
	public static final String EMPLOYEE_COLUMN_LAST_NAME = "lastName";
	public static final String EMPLOYEE_COLUMN_ADDRESS = "address";
	public static final String EMPLOYEE_COLUMN_CITY = "city";
	public static final String EMPLOYEE_COLUMN_PROVINCE = "province";
	public static final String EMPLOYEE_COLUMN_POSTAL_CODE = "postalCode";
	public static final String EMPLOYEE_COLUMN_PHONE = "phone";
	public static final String EMPLOYEE_COLUMN_EMAIL = "email";
	public static final String EMPLOYEE_COLUMN_HIRE_DATE = "hireDate";
	public static final String EMPLOYEE_COLUMN_SALARY = "salary";
	public static final String EMPLOYEE_COLUMN_DEPARTMENT_ID = "departmentId";
	public static final String TABLE_DEPARTMENT = "department";
	public static final String DEPARTMENT_COLUMN_ID = "departmentId";
	public static final String DEPARTMENT_COLUMN_NAME = "departmentName";
	public static final String DEPARTMENT_COLUMN_MANAGER = "manager";
	public static final String TABLE_CITY = "city";
	public static final String CITY_COLUMN_ID = "cityId";
	public static final String CITY_COLUMN_NAME = "name";
	
	
	//Create the database tables
	
	
	
	public static final String CREATE_TABLE_EMPLOYEE = 
			"CREATE TABLE " + TABLE_EMPLOYEE  + " (" +
			 EMPLOYEE_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " + 
			 EMPLOYEE_COLUMN_FIRST_NAME + " VARCHAR(30), " +
			 EMPLOYEE_COLUMN_LAST_NAME + " VARCHAR(30), " +
			 EMPLOYEE_COLUMN_ADDRESS + " VARCHAR(50), " + 
			 EMPLOYEE_COLUMN_CITY + " VARCHAR(50), " + 
			 EMPLOYEE_COLUMN_PROVINCE + " VARCHAR(50), " +
			 EMPLOYEE_COLUMN_POSTAL_CODE + " VARCHAR(30), " +
			 EMPLOYEE_COLUMN_PHONE + " VARCHAR(30), " +
			 EMPLOYEE_COLUMN_EMAIL + " VARCHAR(30), " +
			 EMPLOYEE_COLUMN_HIRE_DATE + " VARCHAR(30), " +
			 EMPLOYEE_COLUMN_SALARY + " VARCHAR(30), " +
			 EMPLOYEE_COLUMN_DEPARTMENT_ID + " VARCHAR(30), " +
			 "PRIMARY KEY(" + EMPLOYEE_COLUMN_ID + ")" +
			
			
			");";
	
	
	
	public static final String CREATE_TABLE_DEPARTMENT = 
			"CREATE TABLE " + TABLE_DEPARTMENT  + " (" +
			 DEPARTMENT_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " + 
			 DEPARTMENT_COLUMN_NAME + " VARCHAR(30), " +
			 DEPARTMENT_COLUMN_MANAGER + " VARCHAR(30), " +
			 "PRIMARY KEY(" + DEPARTMENT_COLUMN_ID + ")" +
			
			
			");";
	
	
	public static final String CREATE_TABLE_CITY = 
			"CREATE TABLE " + TABLE_CITY  + " (" +
			 CITY_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " + 
			 CITY_COLUMN_NAME + " VARCHAR(30), " +
			 "PRIMARY KEY(" + DEPARTMENT_COLUMN_ID + ")" +
			");";
	
	
	
	
	
	
	
	
	
	
}
