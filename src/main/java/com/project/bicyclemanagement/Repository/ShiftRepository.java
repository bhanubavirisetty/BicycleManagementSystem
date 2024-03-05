package com.project.bicyclemanagement.Repository;

import com.project.bicyclemanagement.Entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift,Integer> {
}
