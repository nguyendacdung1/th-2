package com.example.Example1.service.impl;

import com.example.Example1.dto.EmployeeDto;
import com.example.Example1.entity.Employee;
import com.example.Example1.repository.EmployeeRepositoryInterface;
import com.example.Example1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class EmployeeServiceImplement implements EmployeeService{
    @Autowired
    EmployeeRepositoryInterface employeeRepo;

    @Override
    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
}
