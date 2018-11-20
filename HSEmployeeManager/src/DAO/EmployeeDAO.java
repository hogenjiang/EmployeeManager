package DAO;

import Models.Employee;

public interface EmployeeDAO {
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
}
