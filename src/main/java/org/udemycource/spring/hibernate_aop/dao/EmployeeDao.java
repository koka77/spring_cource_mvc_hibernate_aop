package org.udemycource.spring.hibernate_aop.dao;

import org.udemycource.spring.hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();
}
