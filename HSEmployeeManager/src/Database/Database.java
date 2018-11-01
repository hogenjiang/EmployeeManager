package Database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
/**
 * Singleton design so entire application using only one connection
 * private constructor
 * a static instance variable
 * a static method getInstance()*/
	
	//Create instance variable and private constructor
	private static Database instance = null;
	private Connection connection = null;
	private Database() {
		if(connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = 
						DriverManager.getConnection("jdbc:mysql://php.scweb.ca/" + Const.DB_NAME + "?useSSL=false", Const.DB_USER, Const.DB_PASS);

				System.out.println("Successfully Created Connection");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			createTable(Const.TABLE_LOGIN, Const.CREATE_TABLE_LOGIN, connection);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	//getInstance and getConnection method
	public static Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}
	public Connection getConnection() {
		return connection;
	}
	
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
