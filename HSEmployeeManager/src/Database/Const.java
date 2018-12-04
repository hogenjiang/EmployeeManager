package Database;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
	public static final String EMPLOYEE_COLUMN_SALARY = "salary";
	public static final String EMPLOYEE_COLUMN_TITLE = "title";
	public static final String EMPLOYEE_COLUMN_PROVINCE = "province";
	public static final String EMPLOYEE_COLUMN_CITY = "city";
	public static final String EMPLOYEE_COLUMN_DEPARTMENT = "department";
	public static final String EMPLOYEE_COLUMN_ADDRESS = "address";
	public static final String EMPLOYEE_COLUMN_PHONE = "phone";
	public static final String EMPLOYEE_COLUMN_EMAIL = "email";
	public static final String EMPLOYEE_COLUMN_GENDER = "gender";
	public static final String EMPLOYEE_COLUMN_STATUS = "status";
	public static final String EMPLOYEE_COLUMN_STARTDATE = "startDate";
	public static final String EMPLOYEE_COLUMN_ENDDATE = "endDate";
	public static final String image = "image";



	public static final String TABLE_PROVINCE = "province";
	public static final String PROVINCE_COLUMN_ID = "id";
	public static final String PROVINCE_COLUMN_PROVINCE = "province";

	public static final String TABLE_SITUATION = "situation";
	public static final String SITUATION_COLUMN_ID = "id";
	public static final String SITUATION_COLUMN_SITUATION = "situation";

	public static final String TABLE_DEPARTMENT = "department";
	public static final String DEPARTMENT_COLUMN_ID = "id";
	public static final String DEPARTMENT_COLUMN_DEPARTMENT = "department";

	public static final String TABLE_TITLE = "title";
	public static final String TITLE_COLUMN_ID = "id";
	public static final String TITLE_COLUMN_TITLE = "title";




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
					EMPLOYEE_COLUMN_SALARY + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_ADDRESS + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_PHONE + " VARCHAR(10), " +
					EMPLOYEE_COLUMN_EMAIL + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_GENDER + " VARCHAR(50), " +
					EMPLOYEE_COLUMN_BIRTHDATE + " DATE, " +
					EMPLOYEE_COLUMN_STARTDATE + " DATE, " +
					EMPLOYEE_COLUMN_ENDDATE + " DATE, " +
					EMPLOYEE_COLUMN_TITLE + " int REFERENCES " +
					TABLE_TITLE + "(" + TITLE_COLUMN_ID + ")," +
					EMPLOYEE_COLUMN_DEPARTMENT + " int REFERENCES " +
					TABLE_DEPARTMENT + "(" + DEPARTMENT_COLUMN_ID + ")," +
					EMPLOYEE_COLUMN_STATUS + " int REFERENCES " +
					TABLE_SITUATION + "(" + SITUATION_COLUMN_ID + ")," +
					EMPLOYEE_COLUMN_PROVINCE + " int REFERENCES " +
					TABLE_PROVINCE + "(" + PROVINCE_COLUMN_ID + ")," +
					EMPLOYEE_COLUMN_CITY + " VARCHAR(50), " +
					image + " BLOB, " +
					"PRIMARY KEY(" + EMPLOYEE_COLUMN_ID + ")" +
					");";




	public static final String CREATE_TABLE_DEPARTMENT =
			"CREATE TABLE " + TABLE_DEPARTMENT  + " (" +
					DEPARTMENT_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
					DEPARTMENT_COLUMN_DEPARTMENT + " VARCHAR(50), " +
					"PRIMARY KEY(" + DEPARTMENT_COLUMN_ID + ")" +
					");";



	public static final String CREATE_TABLE_TITLE =
			"CREATE TABLE " + TABLE_TITLE  + " (" +
					TITLE_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
					TITLE_COLUMN_TITLE + " VARCHAR(50), " +
					"PRIMARY KEY(" + TITLE_COLUMN_ID + ")" +
					");";


	public static final String CREATE_TABLE_SITUATION =
			"CREATE TABLE " + TABLE_SITUATION  + " (" +
					SITUATION_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
					SITUATION_COLUMN_SITUATION + " VARCHAR(50), " +
					"PRIMARY KEY(" + SITUATION_COLUMN_ID + ")" +
					");";

	public static final String CREATE_TABLE_PROVINCE =
			"CREATE TABLE " + TABLE_PROVINCE  + " (" +
					PROVINCE_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
					PROVINCE_COLUMN_PROVINCE + " VARCHAR(50), " +
					"PRIMARY KEY(" + PROVINCE_COLUMN_ID + ")" +
					");";



}
