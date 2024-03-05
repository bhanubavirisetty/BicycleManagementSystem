package com.project.bicyclemanagement.Controller;

import com.project.bicyclemanagement.CustomResponses.ResponseHandler;
import com.project.bicyclemanagement.Entity.Employee;
import com.project.bicyclemanagement.Entity.Shift;
import com.project.bicyclemanagement.Repository.EmployeeRepository;
import com.project.bicyclemanagement.Service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/shift")
public class ShiftController {
    @Autowired
    ShiftService shiftService;

    @Autowired
    EmployeeRepository employeeRepository;


    @PostMapping("/saveDetails")
    public ResponseEntity<Object> saveDetail(@RequestBody Shift shift) {
        Optional<Employee> employee = employeeRepository.findById(shift.geteId());
        if (employee.isPresent()) {
            Shift shift1 = shiftService.saveDetail(shift);
            if (shift1 != null) {
                return new ResponseEntity<Object>("Shift Record saved Successfully", HttpStatus.OK);
            }
        }
        return new ResponseEntity<Object>("EmployeeId didn't found,Shift Record not saved", HttpStatus.NO_CONTENT);
    }
}
