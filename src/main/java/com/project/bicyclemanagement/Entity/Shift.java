package com.project.bicyclemanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.time.LocalTime;
import java.util.*;

@Entity(name="shift")
public class Shift {

    @Id
    private int shiftId;
    private Date date;
    private LocalTime startTime;
    private LocalTime endTime;

    private int eId;

    public Shift(int shiftId, Date date, LocalTime startTime, LocalTime endTime, int eId) {
        this.shiftId = shiftId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eId = eId;
    }

    public Shift() {

    }

    public int getShiftId() {
        return shiftId;
    }

    public void setShiftId(int shiftId) {
        this.shiftId = shiftId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }
}

