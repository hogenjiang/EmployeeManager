package Database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	/**
	 * This class is using the Singleton design pattern so that 
	 * the entire application is using only one connection
	 * We do this through the use of:
	 * 	- a private constructor
	 *  - a private static instance variable
	 *  - a static method getInstance()
	 * The method will create/return the one instance of the
	 * database class allowing the application to only ever 
	 * have once instance of the database class
	 */
	//Create an instance variable
	private static Database instance = null;
	private Connection connection = null;
	//Create a private constructor
	private Database() {
		//if we do not have a connection
		if(connection == null) {
			//Try and make a connection
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = 
				DriverManager
				.getConnection("jdbc:mysql://php.scweb.ca/"+
				 Const.DB_NAME + "?useSSL=false",
								Const.DB_USER, Const.DB_PASS);
				System.out.println("Successfully Created Connection");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			createTable(Const.TABLE_EMPLOYEE, 
					Const.CREATE_TABLE_EMPLOYEE, connection);
			createTable(Const.TABLE_DEPARTMENT, 
					Const.CREATE_TABLE_DEPARTMENT, connection);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	//Create a getInstance method
	public static Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}
	//Create a getConnection method
	public Connection getConnection() {
		return connection;
	}
	
	/**
	 * Will create the table if it does not exist in the db
	 * @param tableName is the name of the table to be created in the db
	 * @param tableQuery is the query needed to create the table in the db
	 * @param connection is the connection to the db
	 * @throws SQLException 
	 */
	public void createTable(String tableName, 
			String tableQuery,
			Connection connection) throws SQLException {
			Statement sqlStatement;
			//Grab the database meta data
			DatabaseMetaData md = connection.getMetaData();
			//Grab if the table exists in the database
			ResultSet result = md.getTables(null, null, tableName, null);
			//if I have a next value (the table exists, otherwise it does not)
			if(result.next()) {
				System.out.println( tableName + " Table already exists");
			}
			else {
				sqlStatement = connection.createStatement();
				sqlStatement.execute(tableQuery);
				System.out.println("The " + tableName + " table has been inserted");
			}
	}
	
	
}
