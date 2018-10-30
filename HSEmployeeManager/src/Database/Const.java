package Database;

public class Const {
public static final String DB_NAME = "jjiangblog";
public static final String DB_USER = "jjiang";
public static final String DB_PASS = "hl8whhl8whshc49shc49";


public static final String TABLE_LOGIN = "login";
public static final String LOGIN_COLUMN_ID = "id";
public static final String LOGIN_COLUMN_NAME = "name";

public static final String CREATE_TABLE_LOGIN =
"CREATE TABLE " + TABLE_LOGIN + " (" +
		LOGIN_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
		LOGIN_COLUMN_NAME + " VARCHAR(50), " +
		"PRIMARY KEY(" + LOGIN_COLUMN_ID + ")" +
		");";
}
