package Tables;

import DAO.TitleDAO;
import Database.Database;
import Models.Title;
import Database.Const;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TitleTable implements TitleDAO {
    Database db = Database.getInstance();
    ArrayList<Title> titles = new ArrayList<Title>();

    @Override
    public ArrayList<Title> getAllTitle() {
        String query = "SELECT * FROM " + Const.TABLE_TITLE;
        titles = new ArrayList<Title>();
        try {
            Statement getLocations = db.getConnection().createStatement();
            ResultSet data = getLocations.executeQuery(query);
            while(data.next()) {
                titles.add(
                        new Title(
                                data.getInt(Const.TITLE_COLUMN_ID),
                                data.getString(Const.TITLE_COLUMN_TITLE)
                        ));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return titles;
    }
}
