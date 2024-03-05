package com.project.bicyclemanagement.Entity;

public class Model {
    private int MoId;
    private String name;
    private int aId;

    private int mId;
    private String suitedFor;

    public Model(int moId, String name, int aId, int mId, String suitedFor) {
        MoId = moId;
        this.name = name;
        this.aId = aId;
        this.mId = mId;
        this.suitedFor = suitedFor;
    }

    public int getMoId() {
        return MoId;
    }

    public void setMoId(int moId) {
        MoId = moId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getSuitedFor() {
        return suitedFor;
    }

    public void setSuitedFor(String suitedFor) {
        this.suitedFor = suitedFor;
    }
}
