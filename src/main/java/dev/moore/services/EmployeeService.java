package dev.moore.services;

import dev.moore.api.Employee;
import dev.moore.daos.EmployeeDAO;

import java.util.List;

public interface EmployeeService {

    Employee registerEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee updateEmployee(int id, Employee employee);
    boolean deleteEmployeeById(int id);

}
