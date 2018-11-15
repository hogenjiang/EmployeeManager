package DAO;
import java.util.ArrayList;
import Models.Account;

public interface AccountDAO {
	public ArrayList<Account> getAllAcounts();
	public Account getAccount(int accountID);
	public void updateAccount(Account account);
	public void deleteAccount(Account account);
	public void createAccount(Account account);
	public Account getLogin(String login, String password);
}
