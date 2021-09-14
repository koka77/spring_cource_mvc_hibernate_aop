package org.udemycource.spring.hibernate_aop.service;

import org.udemycource.spring.hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deletEmployee(int id);
}
