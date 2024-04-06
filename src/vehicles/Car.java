package vehicles;
import UI.Utils;
/**
 * Car class that describes the state of a car.
 */
public abstract class Car {

    /**
     * Constructs car objects based off of data from car_data.csv
     */

    public Car(String[] contents) {
        this.carID = Integer.parseInt(contents[0]);
        this.type = contents[1];
        this.model = contents[2];
        this.isNew = contents[3].equals("New") ? true : false;
        this.color = contents[4];
        this.capacity = Integer.parseInt(contents[5]);
        this.mileage = Integer.parseInt(contents[6]);
        this.fuelType = contents[7];
        this.isAutomatic = contents[8].equals("Automatic") ? true : false;
        this.vin = contents[9];
        this.price = Double.parseDouble(contents[10]);
        this.vehiclesRemaining = Integer.parseInt(contents[11]);
    }

    /**
     * Car ID number used for shop identification purposes.
     */
    private int carID;

    /**
     * Type of car may be Sedan, Pickup, Hatchback, or SUV
     */
    private String type;
    
    /**
     * Model of car.
     */
    private String model;
    
    /**
     * Condition of car true means new, false means used.
     */
    private boolean isNew;
    
    /**
     * Color of the car.
     */
    private String color;
    
    /**
     * Refers to the number of seats.
     */
    private int capacity;
    
    /**
     * The number of miles on the car.
     */
    private int mileage;
    
    /**
     * The type of fuel the car takes, may be Hybrid, Diesel, Electric, or Gasoline.
     */
    private String fuelType;
    
    /**
     * Type of transmission is automatic if true manual otherwise.
     */
    private boolean isAutomatic;
    
    /**
     * VIN number for identification purposes.
     */
    private String vin;
    
    /**
     * Price of the car.
     */
    private double price;
    
    /**
     *  Used to determine if the vehicle is available for purchase.
     */
    private int vehiclesRemaining;
    
    
    /**
     * Provides a description of a specific instance of a car.
     * @return A string description of all attributes.
     */
    @Override
    public String toString() {
        Utils.longerLine();
        return 
        getCarID() + "\t" + 
        getType() + "\t" + 
        getModel() + "\t" + 
        (isNew() ? "New" : "Used") + "\t" + 
        getColor() + "\t" + 
        getCapacity() + "\t" + 
        getMileage() + "\t" + 
        getFuelType() + "\t" + 
        (isAutomatic() ? "Automatic" : "Manual") + "\t" +
        getVin() + "\t" + 
        getPrice() + "\t" + 
        getVehiclesRemaining(); 
    }
    
    // getters and setters

    public int getCarID() {
        return carID;
    }
    
    public void setCarID(int carID) {
        this.carID = carID;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean condition) {
        this.isNew = condition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean transmissionType) {
        this.isAutomatic = transmissionType;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVehiclesRemaining() {
        return vehiclesRemaining;
    }

    public void setVehiclesRemaining(int vehiclesRemaining) {
        this.vehiclesRemaining = vehiclesRemaining;
    }
    
}
