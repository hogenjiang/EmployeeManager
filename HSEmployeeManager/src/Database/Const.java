package Database;

public class Const {
	public static final String DB_NAME = "test";
	public static final String DB_USER = "hogenjiang";
	public static final String DB_PASS = "jiang318";

//Create a constant for each table column

//Create an account
	public static final String TABLE_USER = "user";
	public static final String ACCOUNT_COLUMN_ID = "id";
	public static final String ACCOUNT_COLUMN_LOGIN = "login";
	public static final String ACCOUNT_COLUMN_PASSWORD = "password";
	public static final String ACCOUNT_COLUMN_EMAIL = "email";
	public static final String ACCOUNT_COLUMN_GENDER = "gender";

//Create an Employee profile
	public static final String TABLE_EMPLOYEE = "employee";
	public static final String EMPLOYEE_COLUMN_ID = "id";
	public static final String EMPLOYEE_COLUMN_EMPLOYEEID = "employeeId";
	public static final String EMPLOYEE_COLUMN_FIRSTNAME = "firstName";
	public static final String EMPLOYEE_COLUMN_LASTNAME = "lastName";
	public static final String EMPLOYEE_COLUMN_BIRTHDATE = "birthDate";
	public static final String EMPLOYEE_COLUMN_SIN = "sin";
	public static final String EMPLOYEE_COLUMN_PROFILE = "profile";
	public static final String EMPLOYEE_COLUMN_SALARY = "salary";
	public static final String EMPLOYEE_COLUMN_TITLE = "title";
	public static final String EMPLOYEE_COLUMN_DEPARTMENT = "department";
	public static final String EMPLOYEE_COLUMN_ADDRESS = "address";
	public static final String EMPLOYEE_COLUMN_PHONE = "phone";
	public static final String EMPLOYEE_COLUMN_EMAIL = "email";
	public static final String EMPLOYEE_COLUMN_GENDER = "gender";
	public static final String EMPLOYEE_COLUMN_STATUS = "status";
	public static final String EMPLOYEE_COLUMN_STARTDATE = "startDate";
	public static final String EMPLOYEE_COLUMN_ENDDATE = "endDate";


public static final String CREATE_TABLE_USER =
		"CREATE TABLE " + TABLE_USER  + " (" +
		ACCOUNT_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
		ACCOUNT_COLUMN_LOGIN + " VARCHAR(50), " +
		ACCOUNT_COLUMN_PASSWORD + " VARCHAR(50), " +
		ACCOUNT_COLUMN_EMAIL + " VARCHAR(50), " +
		ACCOUNT_COLUMN_GENDER + " VARCHAR(50), " +
		"PRIMARY KEY(" + ACCOUNT_COLUMN_ID + ")" +
		");";

	public static final String CREATE_TABLE_EMPLOYEE =
			"CREATE TABLE " + TABLE_EMPLOYEE  + " (" +
					EMPLOYEE_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
					EMPLOYEE_COLUMN_EMPLOYEEID + " VARCHAR(5), " +
					EMPLOYEE_COLUMN_FIRSTNAME + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_LASTNAME + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_SIN + " VARCHAR(9), " +
					EMPLOYEE_COLUMN_PROFILE + " BLOB, " +
					EMPLOYEE_COLUMN_SALARY + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_TITLE + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_DEPARTMENT + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_ADDRESS + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_PHONE + " VARCHAR(10), " +
					EMPLOYEE_COLUMN_EMAIL + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_GENDER + " VARCHAR(10), " +
					EMPLOYEE_COLUMN_STATUS + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_BIRTHDATE + " DATE, " +
					EMPLOYEE_COLUMN_STARTDATE + " DATE, " +
					EMPLOYEE_COLUMN_ENDDATE + " DATE, " +
					"PRIMARY KEY(" + EMPLOYEE_COLUMN_ID + ")" +
					");";

}
