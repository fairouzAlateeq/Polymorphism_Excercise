package com.ps;

public class House extends Assets {
    String address;
    int condition;
    int sqFoot;
    int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int sqFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.sqFoot = sqFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSqFoot() {
        return sqFoot;
    }

    public void setSqFoot(int sqFoot) {
        sqFoot = sqFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        int cond = getCondition();
        double perSq = 0;
        switch (cond) {
            case 1:
                perSq = 180.00;
            case 2:
                perSq = 130.00;
            case 3:
                perSq = 90.00;
            case 4:
                perSq = 80.00;
        }

    return perSq;
    }
}
