package com.project.bicyclemanagement.Entity;


import jakarta.persistence.*;

import java.util.*;

@Entity (name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String emailId;
    private long contactNumber;
    private char gender;
    private String address;

    public Employee(int eId, String firstName, String lastName, Date dob, String emailId, long contactNumber, char gender, String address) {
        this.eId = eId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.address = address;
    }

    public Employee() {

    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
