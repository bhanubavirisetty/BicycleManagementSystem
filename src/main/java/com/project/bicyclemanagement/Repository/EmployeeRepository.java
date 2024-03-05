package com.project.bicyclemanagement.Repository;

import com.project.bicyclemanagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EmployeeRepository extends JpaRepository<Employee,Integer> {
}
