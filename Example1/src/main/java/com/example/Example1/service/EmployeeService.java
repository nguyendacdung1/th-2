package com.example.Example1.service;

import com.example.Example1.dto.EmployeeDto;
import com.example.Example1.entity.Employee;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee createEmployee(Employee employee);
}
