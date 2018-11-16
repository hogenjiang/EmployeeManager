package Database;

public class Const {
	public static final String DB_NAME = "jjiangblog";
	public static final String DB_USER = "jjiang";
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
	public static final String EMPLOYEE_COLUMN_EMPLOYEEID = "employee id";
	public static final String EMPLOYEE_COLUMN_FIRSTNAME = "first name";
	public static final String EMPLOYEE_COLUMN_LASTNAME = "last name";
	public static final String EMPLOYEE_COLUMN_BIRTHDATE = "birth date";
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
	public static final String EMPLOYEE_COLUMN_STARTDATE = "start date";
	public static final String EMPLOYEE_COLUMN_ENDDATE = "end date";


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
					EMPLOYEE_COLUMN_EMPLOYEEID + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_FIRSTNAME + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_LASTNAME + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_SIN + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_PROFILE + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_SALARY + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_TITLE + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_DEPARTMENT + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_ADDRESS + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_PHONE + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_EMAIL + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_GENDER + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_STATUS + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_BIRTHDATE + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_STARTDATE + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_ENDDATE + " VARCHAR(50), " +
					"PRIMARY KEY(" + EMPLOYEE_COLUMN_ID + ")" +
					");";

}
