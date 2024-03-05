package com.project.bicyclemanagement.Entity;

public class Customer {
    private int customerId;

    private String customerFirstName;
    private String customerLastName;
    private long customerContactNumber;
    private String customerAddress;

    public Customer(int customerId, String customerFirstName, String customerLastName, long customerContactNumber, String customerAddress) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerContactNumber = customerContactNumber;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public long getCustomerContactNumber() {
        return customerContactNumber;
    }

    public void setCustomerContactNumber(long customerContactNumber) {
        this.customerContactNumber = customerContactNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
