package com.project.bicyclemanagement.Entity;

public class Manufacturer {
    private int mId;
    private String name;
    private String address;
    private long contactNumber;
    private String emailId;

    public Manufacturer(int mId, String name, String address, long contactNumber, String emailId) {
        this.mId = mId;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
