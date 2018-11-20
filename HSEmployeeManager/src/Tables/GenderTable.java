package Tables;

import DAO.GenderDAO;
import Database.Database;
import Models.Gender;
import Database.Const;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GenderTable implements GenderDAO {
    Database db = Database.getInstance();
    ArrayList<Gender> genders = new ArrayList<Gender>();

    @Override
    public ArrayList<Gender> getAllGender() {
        String query = "SELECT * FROM " + Const.TABLE_GENDER;
        genders = new ArrayList<Gender>();
        try {
            Statement getLocations = db.getConnection().createStatement();
            ResultSet data = getLocations.executeQuery(query);
            while(data.next()) {
                genders.add(
                        new Gender(
                                data.getInt(Const.GENDER_COLUMN_ID),
                                data.getString(Const.GENDER_COLUMN_GENDER)
                        ));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return genders;
    }
}
