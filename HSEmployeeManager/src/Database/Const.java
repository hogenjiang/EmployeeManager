package Database;

public class Const {
public static final String DB_NAME = "jjiangblog";
public static final String DB_USER = "jjiang";
public static final String DB_PASS = "hl8whhl8whshcshc";

//Create a constant for each table column

public static final String TABLE_ITEM = "item";
public static final String ITEM_COLUMN_ID = "id";
public static final String ITEM_COLUMN_NAME = "name";
public static final String ITEM_COLUMN_YEAR = "year";
public static final String ITEM_COLUMN_CONDITION = "coin_condition";
public static final String ITEM_COLUMN_LOCATION = "location";

public static final String TABLE_LOCATION = "location";
public static final String LOCATION_COLUMN_ID = "id";
public static final String LOCATION_COLUMN_NAME = "name";
public static final String LOCATION_COLUMN_LONGITUDE = "longitude";
public static final String LOCATION_COLUMN_LATITUDE = "latitude";

//Create the database tables

//public static final String CREATE_TABLE_LOCATIONS = 
//		"CREATE TABLE " + TABLE_LOCATION + " (" + 
//		LOCATION_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
//		LOCATION_COLUMN_NAME + " VARCHAR(50), " +
//		LOCATION_COLUMN_LONGITUDE + " VARCHAR(50), " + 
//		LOCATION_COLUMN_LATITUDE + " VARCHAR(50), " +
//		"PRIMARY KEY(" + LOCATION_COLUMN_ID + ")" +
//		");";
//
//public static final String CREATE_TABLE_ITEMS = 
//		"CREATE TABLE " + TABLE_ITEM  + " (" +
//		ITEM_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " + 
//		ITEM_COLUMN_NAME + " VARCHAR(50), " + 
//		ITEM_COLUMN_YEAR + " VARCHAR(50), " + 
//		ITEM_COLUMN_CONDITION + " VARCHAR(50), " + 
//		ITEM_COLUMN_LOCATION + " int REFERENCES " +
//		TABLE_LOCATION + "(" + LOCATION_COLUMN_ID + ")," +
//		"PRIMARY KEY(" + ITEM_COLUMN_ID +")" +
//		");";
}
