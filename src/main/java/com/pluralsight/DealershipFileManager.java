package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {

    private static final String FILE_PATH = "src/main/resources/inventory.csv";

    public static Dealership getDealership() {
        Dealership dealership = null;
        List<Vehicle> inventory = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String name = reader.readLine();
            String address = reader.readLine();
            String phone = reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] vehicleInfo = line.split("\\|");
                if (vehicleInfo.length == 8) {
                    int vin = Integer.parseInt(vehicleInfo[0]);
                    int year = Integer.parseInt(vehicleInfo[1]);
                    String make = vehicleInfo[2];
                    String model = vehicleInfo[3];
                    String vehicleType = vehicleInfo[4];
                    String color = vehicleInfo[5];
                    int odometer = Integer.parseInt(vehicleInfo[6]);
                    double price = Double.parseDouble(vehicleInfo[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    inventory.add(vehicle);
                }
            }
            System.out.println("Total vehicles read: " + inventory.size());

            dealership = new Dealership(name, address, phone);
            dealership.setInventory(inventory);
        } catch (IOException e) {
            System.out.println("Error reading dealership file: " + e.getMessage());
        }
        return dealership;
    }

    public static void saveDealership(Dealership dealership) {
    }
}
