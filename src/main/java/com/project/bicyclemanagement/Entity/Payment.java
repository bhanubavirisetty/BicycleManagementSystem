package com.project.bicyclemanagement.Entity;

import java.util.Date;

public class Payment {
    private int paymentId;

    private int orderId;

    private int amount;
    private long cardNumber;
    private Date created;


    public Payment(int paymentId, int orderId, int amount, long cardNumber, Date created) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.created = created;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
