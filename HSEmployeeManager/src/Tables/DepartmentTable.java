package Tables;

import DAO.DepartmentDAO;
import Database.Database;
import Models.Department;
import Database.Const;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DepartmentTable implements DepartmentDAO {

    Database db = Database.getInstance();
    ArrayList<Department> departments = new ArrayList<Department>();

    @Override
    public ArrayList<Department> getAllDepartment() {
        String query = "SELECT * FROM " + Const.TABLE_DEPARTMENT;
        departments = new ArrayList<Department>();
        try {
            Statement getLocations = db.getConnection().createStatement();
            ResultSet data = getLocations.executeQuery(query);
            while(data.next()) {
                departments.add(
                        new Department(
                                data.getInt(Const.DEPARTMENT_COLUMN_ID),
                                data.getString(Const.DEPARTMENT_COLUMN_DEPARTMENT)
                        ));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
                return departments;
    }


}
