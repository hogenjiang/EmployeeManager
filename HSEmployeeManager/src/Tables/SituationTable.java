package Tables;

import DAO.SituationDAO;
import Database.Database;
import Models.Situation;
import Database.Const;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SituationTable implements SituationDAO {
    Database db = Database.getInstance();
    ArrayList<Situation> situations = new ArrayList<Situation>();

    @Override
    public ArrayList<Situation> getAllSituation() {
        String query = "SELECT * FROM " + Const.TABLE_SITUATION;
        situations = new ArrayList<Situation>();
        try {
            Statement getLocations = db.getConnection().createStatement();
            ResultSet data = getLocations.executeQuery(query);
            while(data.next()) {
                situations.add(
                        new Situation(
                                data.getInt(Const.SITUATION_COLUMN_ID),
                                data.getString(Const.SITUATION_COLUMN_SITUATION)
                        ));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return situations;
    }
}
