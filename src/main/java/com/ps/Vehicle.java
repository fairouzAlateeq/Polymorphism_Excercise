package com.ps;

public class Vehicle extends Assets {
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        double res = super.getOriginalCost();
        if (getYear()>= 0 || getYear()<=3)
            res *= .03;
        else if (getYear()>= 4 || getYear()<=6)
            res *= .06;
        else if (getYear()>= 7 || getYear()<=10)
            res *= .08;
        else res -= 1000;

        boolean makeModelContainsHonda = makeModel.toLowerCase().contains("honda");
        boolean makeModelContainsToyota = makeModel.toLowerCase().contains("toyota");

        if (getOdometer()>=100000 && !makeModelContainsHonda && !makeModelContainsToyota)
            res *=.25;


        return res;
    }
}
