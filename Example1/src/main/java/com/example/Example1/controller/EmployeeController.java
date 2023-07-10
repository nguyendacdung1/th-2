package com.example.Example1.controller;

import com.example.Example1.entity.Employee;
import com.example.Example1.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping(value = "api/v1")
public class EmployeeController extends BaseController{
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(value = "/employees")    // giong ben tren nhung n,gan gon hon
    public String gets(Model model){

        List<Employee> employees = employeeService.getAll();
        model.addAttribute("employees", employees);

        return "create";
    }
    @GetMapping(value = "/create")
    public String createEmployee() {
        return "index";
    }
    @PostMapping(value = "/create")
    public String createEmployee(@ModelAttribute Employee employee) {
        employeeService.createEmployee(employee);
        return "create";
    }


}
