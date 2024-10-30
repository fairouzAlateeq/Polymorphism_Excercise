package com.ps;

import java.util.ArrayList;

public class Main {
    static ArrayList<Assets> assets = new ArrayList<>();

    public static void main(String[] args) {
        assets.add(new House ("this is a house","02/05/2023", 84000.00, "322 house street", 4, 200, 24));
        assets.add(new House ("this is a vacation house","11/05/2020", 140000.00, "countryside venus tx", 4, 1010, 500));
        assets.add(new Vehicle("motorcycle", "07/05/2024", 21000, "Harley-davidson heritage classic 114", 2024, 0));
        assets.add(new Vehicle("car", "05/13/2016", 1200, "Nissan Altema", 2012, 15000));

        //loop
        for(Assets asset : assets)
            if(asset instanceof House) {
                House house = (House) asset;
                System.out.println("Description: " + house.getDescription() + " " +
                        "Date Acquired: " + house.getDateAcquired() + " " + "Original Price: "
                        + house.getOriginalCost() + " " + "Current price: " + house.getValue());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Description: " + vehicle.getDescription()
                + " " + "Date Accquired: " + vehicle.getDateAcquired()+ " "
                + " Original cost: " + vehicle.getOriginalCost() + " "
                +" Current price: " + vehicle.getValue());
            }
            }



}
