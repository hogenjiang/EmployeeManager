package DAO;

import Models.Employee;
import javafx.scene.text.Text;

import java.util.ArrayList;

public interface EmployeeDAO {
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
//    public Text getEmployee();
    public ArrayList<Employee> getAllEmployees();
}
