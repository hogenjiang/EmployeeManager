package Tables;

import DAO.EmployeeDAO;
import Database.Const;
import Database.Database;
import Models.Employee;
import javafx.scene.image.Image;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeTable implements EmployeeDAO {

    Database db = Database.getInstance();
    ArrayList<Employee> employees;

    @Override
    public void createEmployee(Employee employee) {
        String query = "INSERT INTO " + Const.TABLE_EMPLOYEE +
                "(" + Const.EMPLOYEE_COLUMN_EMPLOYEEID + "," +
                Const.EMPLOYEE_COLUMN_FIRSTNAME + "," +
                Const.EMPLOYEE_COLUMN_LASTNAME + "," +
                Const.EMPLOYEE_COLUMN_SALARY + "," +
                Const.EMPLOYEE_COLUMN_ADDRESS + "," +
                Const.EMPLOYEE_COLUMN_PHONE + "," +
                Const.EMPLOYEE_COLUMN_EMAIL + "," +
                Const.EMPLOYEE_COLUMN_BIRTHDATE + "," +
                Const.EMPLOYEE_COLUMN_STARTDATE + "," +
                Const.EMPLOYEE_COLUMN_ENDDATE + "," +
                Const.EMPLOYEE_COLUMN_TITLE + "," +
                Const.EMPLOYEE_COLUMN_DEPARTMENT + "," +
                Const.EMPLOYEE_COLUMN_GENDER + "," +
                Const.EMPLOYEE_COLUMN_STATUS + "," +
                Const.EMPLOYEE_COLUMN_CITY + "," +
                Const.EMPLOYEE_COLUMN_PROVINCE + ") VALUES ('" +
                employee.getEmployeeId() + "','" + employee.getFirstName() + "','" +
                employee.getLastName() + "','" + employee.getSalary() + "','" +employee.getAddress()
                + "','" + employee.getPhone() + "','" +employee.getEmail() + "','" +
                employee.getBirthDate() + "','" +employee.getStartDate() + "','" +employee.getEndDate() + "','" +employee.getTitle()
                + "','" +employee.getDepartment() + "','" +employee.getGender() + "','" +employee.getStatus()
                + "','" +employee.getCity() + "','" +employee.getProvince() + "')";

        try {
            db.getConnection().createStatement().execute(query);
            System.out.println("Inserted Record");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        String query = "SELECT * FROM " + Const.TABLE_EMPLOYEE;
        employees = new ArrayList<Employee>();
        try {
            Statement getItems = db.getConnection().createStatement();
            ResultSet data = getItems.executeQuery(query);
            //data.next() makes data the first record, then the next record etc.
            while(data.next()) {
                employees.add(new Employee(data.getString(Const.EMPLOYEE_COLUMN_EMPLOYEEID),
                        data.getString(Const.EMPLOYEE_COLUMN_FIRSTNAME),
                        data.getString(Const.EMPLOYEE_COLUMN_LASTNAME)
                       ));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return employees;
    }
}
