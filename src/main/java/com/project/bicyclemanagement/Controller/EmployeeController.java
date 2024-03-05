package com.project.bicyclemanagement.Controller;

import com.project.bicyclemanagement.Entity.Employee;
import com.project.bicyclemanagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/saveAllDetails")
    public List<Employee> saveEmployeeDetails(@RequestBody List<Employee> employee)
    {
        return employeeService.saveAll(employee);
    }
}
