package com.project.bicyclemanagement.Entity;

public class Accessory {
    private int aId;
    private String name;

    public Accessory(int aId, String name) {
        this.aId = aId;
        this.name = name;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
