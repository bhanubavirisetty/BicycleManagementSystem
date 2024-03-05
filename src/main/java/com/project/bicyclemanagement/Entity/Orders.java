package com.project.bicyclemanagement.Entity;
import java.util.*;
public class Orders {
    private int orderId;
    private int customerId;
    private int eId;
    private int MoId;

   private String status;

   private int amount;
   private Date created;


    public Orders(int orderId, int customerId, int eId, int moId, String status, int amount, Date created) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.eId = eId;
        MoId = moId;
        this.status = status;
        this.amount = amount;
        this.created = created;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getMoId() {
        return MoId;
    }

    public void setMoId(int moId) {
        MoId = moId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
