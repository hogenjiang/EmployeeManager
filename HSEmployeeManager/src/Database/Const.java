package Database;

public class Const {
public static final String DB_NAME = "test";
public static final String DB_USER = "hogenjiang";
public static final String DB_PASS = "jiang318";

//Create a constant for each table column

public static final String TABLE_USER = "user";
public static final String ACCOUNT_COLUMN_ID = "id";
public static final String ACCOUNT_COLUMN_LOGIN = "login";
public static final String ACCOUNT_COLUMN_PASSWORD = "password";
public static final String ACCOUNT_COLUMN_EMAIL = "email";
public static final String ACCOUNT_COLUMN_GENDER = "gender";

//public static final String TABLE_LOCATION = "location";
//public static final String LOCATION_COLUMN_ID = "id";
//public static final String LOCATION_COLUMN_NAME = "name";
//public static final String LOCATION_COLUMN_LONGITUDE = "longitude";
//public static final String LOCATION_COLUMN_LATITUDE = "latitude";

//Create the database tables

//public static final String CREATE_TABLE_LOCATIONS =
//		"CREATE TABLE " + TABLE_LOCATION + " (" +
//		LOCATION_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
//		LOCATION_COLUMN_NAME + " VARCHAR(50), " +
//		LOCATION_COLUMN_LONGITUDE + " VARCHAR(50), " +
//		LOCATION_COLUMN_LATITUDE + " VARCHAR(50), " +
//		"PRIMARY KEY(" + LOCATION_COLUMN_ID + ")" +
//		");";

public static final String CREATE_TABLE_USER =
		"CREATE TABLE " + TABLE_USER  + " (" +
		ACCOUNT_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
		ACCOUNT_COLUMN_LOGIN + " VARCHAR(50), " +
		ACCOUNT_COLUMN_PASSWORD + " VARCHAR(50), " +
		ACCOUNT_COLUMN_EMAIL + " VARCHAR(50), " +
		ACCOUNT_COLUMN_GENDER + " VARCHAR(50), " +
		"PRIMARY KEY(" + ACCOUNT_COLUMN_ID +")" +
		");";
}
