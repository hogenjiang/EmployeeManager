package Tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.AccountDAO;
import Database.Const;
import Database.Database;
import Models.Account;


public class AccountTable implements AccountDAO {
	
	Database db = Database.getInstance();
	ArrayList<Account> accounts = new ArrayList<Account>();
	Account account = new Account();

	@Override
	public ArrayList<Account> getAllAcounts() {
		String query = "SELECT * FROM " + Const.TABLE_USER;
		try {
			Statement getAccounts = db.getConnection().createStatement();
			ResultSet data = getAccounts.executeQuery(query);
			//data.next() makes data the first record, then the next record etc.
			while(data.next()) {
				accounts.add(new Account(data.getInt(Const.ACCOUNT_COLUMN_ID),
								   data.getString(Const.ACCOUNT_COLUMN_LOGIN),
								   data.getString(Const.ACCOUNT_COLUMN_PASSWORD),
								   data.getString(Const.ACCOUNT_COLUMN_EMAIL),
								   data.getString(Const.ACCOUNT_COLUMN_GENDER)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accounts;
	}

	@Override
	public Account getAccount(int accountID) {
		String query = "SELECT * FROM " + Const.TABLE_USER + " WHERE " +
				   Const.ACCOUNT_COLUMN_ID + " = " + accountID;
	Account account = new Account();
	try {
		Statement getAccount = db.getConnection().createStatement();
		ResultSet data = getAccount.executeQuery(query);
		data.next();
		account = new Account(data.getInt(Const.ACCOUNT_COLUMN_ID),
				   data.getString(Const.ACCOUNT_COLUMN_LOGIN),
				   data.getString(Const.ACCOUNT_COLUMN_PASSWORD),
				   data.getString(Const.ACCOUNT_COLUMN_EMAIL),
				   data.getString(Const.ACCOUNT_COLUMN_GENDER));
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return account;
	}

	@Override
	public void updateAccount(Account account) {
		String query = "UPDATE " + Const.TABLE_USER + " SET " +
		         Const.ACCOUNT_COLUMN_LOGIN + " " + account.getLogin() +  "," +
		         Const.ACCOUNT_COLUMN_PASSWORD + " " + account.getPassword() +  "," +
		         Const.ACCOUNT_COLUMN_EMAIL + " " + account.getEmail() + "," +
		         Const.ACCOUNT_COLUMN_GENDER + " " + account.getGender() +
		         " WHERE " + Const.ACCOUNT_COLUMN_ID + " = " + account.getId();
			try {
				Statement updateAccount = db.getConnection().createStatement();
				updateAccount.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
	}

	@Override
	public void deleteAccount(Account account) {
		String query  = "DELETE FROM " + Const.TABLE_USER + " WHERE " +
				Const.ACCOUNT_COLUMN_ID + " = " + account.getId();
try {
	db.getConnection().createStatement().execute(query);
	System.out.println("Deleted record");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}

	@Override
	public void createAccount(Account account) {
		String query = "INSERT INTO " + Const.TABLE_USER +
				   "(" + Const.ACCOUNT_COLUMN_LOGIN + ", " +
				   Const.ACCOUNT_COLUMN_PASSWORD + "," +
				   Const.ACCOUNT_COLUMN_EMAIL + "," + 
				   Const.ACCOUNT_COLUMN_GENDER + ") VALUES ('" +
				   account.getLogin() + "','" + account.getPassword() + "','" + 
				   account.getEmail() + "','" + account.getGender() +
				   "')";
	try {
		db.getConnection().createStatement().execute(query);
		System.out.println("Inserted Record");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public Account getLogin(String login, String password) {
		String query = "SELECT * FROM " + Const.TABLE_USER + " WHERE " +
				Const.ACCOUNT_COLUMN_LOGIN + " = '" + login + "' AND " +
				Const.ACCOUNT_COLUMN_PASSWORD + " = '" + password + "'";
		try {
			ResultSet data = db.getConnection().createStatement().executeQuery(query);
			if (!data.isBeforeFirst()) {
				return null;
			}
			data.next();
			Account user = this.getAccount(data.getInt(Const.ACCOUNT_COLUMN_ID));
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}



}
