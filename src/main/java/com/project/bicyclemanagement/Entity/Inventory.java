package com.project.bicyclemanagement.Entity;

public class Inventory {
    private int MoId;
    private int quantity;

    public Inventory(int moId, int quantity) {
        MoId = moId;
        this.quantity = quantity;
    }

    public int getMoId() {
        return MoId;
    }

    public void setMoId(int moId) {
        MoId = moId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
