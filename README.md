# Car Dealership
The Dealership Console Application is a Java project designed to simulate a dealership management system. It allows users to perform various tasks related to managing vehicles in a dealership, such as listing vehicles, searching for vehicles based on specific criteria, adding new vehicles to the inventory, and removing vehicles from the inventory.

# Features 
- List vehicles within a price range
- Find vehicles by make and model
- Find vehicles by year range
- Find vehicles by color
- Find vehicles by mileage
- Find vehicles by type (car, truck, SUV, van)
- List all vehicles
- Add a vehicle
- Remove a vehicle

# Getting Started 
To run the application, follow these steps:

1.Clone this repository to your local machine.
2.Compile the Java source files using a Java compiler.
3.Run the main program to start the application.

# Screenshot

<img width="959" alt="CarDealershipScreenshots" src="https://github.com/Nyflyguyx200/CarDealership/assets/114933451/797c52dc-6218-45cc-a604-3e820ca2086a">
<img width="959" alt="CarDealershipScreenshot" src="https://github.com/Nyflyguyx200/CarDealership/assets/114933451/98bc6d7f-b351-416e-99ca-055485ba4ddb">


# Usage 

Once the application is running, you will be presented with a menu displaying various options. Use the number keys to select an option and follow the prompts to perform the desired operation.

# One Piece of Interesting Code

 dealership = new Dealership(name, address, phone);
            dealership.setInventory(inventory);
        } catch (IOException e) {
            System.out.println("Error reading dealership file: " + e.getMessage());

This code segment is particularly interesting because it represents a critical aspect of the application's functionality: loading data from a file and initializing a Dealership object with the information retrieved. It demonstrates handling potential I/O errors gracefully by catching IOException, which could occur during file reading operations.



