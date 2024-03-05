package com.project.bicyclemanagement.Service;

import com.project.bicyclemanagement.Entity.Employee;
import com.project.bicyclemanagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> saveAll(List<Employee> employee)
    {
        return employeeRepository.saveAll(employee);
    }
}
