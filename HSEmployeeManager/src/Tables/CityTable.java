package Tables;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DAO.CityDAO;
import Database.Const;
import Database.Database;
import Enums.Cities;
import JavaBean.City;
import Models.Account;



public class CityTable implements CityDAO {






	Database db = Database.getInstance();
	ArrayList<City> cities;
	
	@Override
	public ArrayList<City> getAllCities() {
		String query = "SELECT * FROM " + Const.TABLE_CITY;
		cities = new ArrayList<City>();
		try {
			Statement getCities = db.getConnection().createStatement();
			ResultSet data = getCities.executeQuery(query);
			//data.next() makes data the first record, then the next record etc.
			while(data.next()) {
				cities.add(new City(data.getInt(Const.CITY_COLUMN_ID),
								   data.getString(Const.CITY_COLUMN_NAME)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cities;
	}

	@Override
	public Account getCity(int cityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCity(Cities city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCity(Cities city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCity(Cities city) {
		// TODO Auto-generated method stub
		
	}

	

	
}


	



	