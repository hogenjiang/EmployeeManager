package Tables;

import DAO.ProvinceDAO;
import Database.Database;
import Models.Province;
import Database.Const;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProvinceTable implements ProvinceDAO {
    Database db = Database.getInstance();
    ArrayList<Province> provinces = new ArrayList<Province>();

    @Override
    public ArrayList<Province> getAllProvince() {
        String query = "SELECT * FROM " + Const.TABLE_PROVINCE;
        provinces = new ArrayList<Province>();
        try {
            Statement getLocations = db.getConnection().createStatement();
            ResultSet data = getLocations.executeQuery(query);
            while(data.next()) {
                provinces.add(
                        new Province(
                                data.getInt(Const.PROVINCE_COLUMN_ID),
                                data.getString(Const.PROVINCE_COLUMN_PROVINCE)
                        ));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return provinces;
    }

   @Override
    public Province getProvince(int provinceID) {
        String query = "SELECT * FROM " + Const.TABLE_PROVINCE + " WHERE "
                + Const.PROVINCE_COLUMN_ID + "=" + "'" + provinceID + "'";
        Province province = null;
        try {
            Statement getProvince = db.getConnection().createStatement();
            ResultSet data = getProvince.executeQuery(query);
            while(data.next()) {
                province = new Province(
                                data.getInt(Const.EMPLOYEE_COLUMN_ID),
                                data.getString(Const.PROVINCE_COLUMN_PROVINCE));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return province;
    }

}
