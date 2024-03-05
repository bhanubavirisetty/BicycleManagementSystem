package com.project.bicyclemanagement.Entity;

public class Refunds {
    private int orderId;
    private int refundAmount;

    public Refunds(int orderId, int refundAmount) {
        this.orderId = orderId;
        this.refundAmount = refundAmount;
    }

    public int getOrderId() {
        
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(int refundAmount) {
        this.refundAmount = refundAmount;
    }
}
