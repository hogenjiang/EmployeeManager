package DAO;

import Models.Employee;

import java.util.ArrayList;

public interface EmployeeDAO {
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public ArrayList<Employee> getAllEmployees();
}
