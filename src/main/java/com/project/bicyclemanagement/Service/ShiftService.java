package com.project.bicyclemanagement.Service;

import com.project.bicyclemanagement.Entity.Employee;
import com.project.bicyclemanagement.Entity.Shift;
import com.project.bicyclemanagement.Repository.EmployeeRepository;
import com.project.bicyclemanagement.Repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShiftService {
    @Autowired
    ShiftRepository shiftRepository;
    @Autowired
    EmployeeRepository employeeRepository;
   /* public String saveDetail(Shift shift)
    {
        Optional<Employee> emp=employeeRepository.findById(shift.geteId());
        if(emp.isPresent())
        {
           // Employee e=emp.get();
            Shift st= shiftRepository.save(shift);
            return "Shift Detail saved Successfully";
        }
        else
        {
            return "EmployeeId not matched";
        }
    }*/

    /*public ResponseEntity<Object> saveDetail(Shift shift)
    {
        Optional<Employee> employee=employeeRepository.findById(shift.geteId());
        if(employee.isPresent())
        {
             Shift shift2=shiftRepository.save(shift);
             return new ResponseEntity<>(shift2, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
        }
    }*/

    public Shift saveDetail(Shift shift)
    {
        Shift shift2=shiftRepository.save(shift);
        return shift2;
    }
}
