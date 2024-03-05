package com.project.bicyclemanagement.Entity;

import java.io.*;
import java.util.*;
public class Salary {
    private int eId;
    private int salary;
    private Date startDate;
    private Date toDate;

    public Salary(int eId, int salary, Date startDate, Date toDate) {
        this.eId = eId;
        this.salary = salary;
        this.startDate = startDate;
        this.toDate = toDate;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
