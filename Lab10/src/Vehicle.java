//Jack Atkinson

public class Vehicle {
    private String manufacturer;
    private int cylinderCount;
    private String owner;

    public Vehicle(){
        this.manufacturer = "Unknown";
        this.cylinderCount = 1;
        this.owner = "Unknown";
    }

    public Vehicle(String xManufacturer, int xCylinderCount, String xOwner){
        this.manufacturer = xManufacturer;
        this.owner = xOwner;
        this.setCylinderCount(xCylinderCount);
    }

    //getters
    public String getManufacturer(){
        return this.manufacturer;
    }

    public int getCylinderCount(){
        return this.cylinderCount;
    }

    public String getOwner(){
        return this.owner;
    }

    //setters
    public void setManufacturer(String xManufacturer){
        this.manufacturer = xManufacturer;
    }

    public void setCylinderCount(int xCylinderCount){
        if (xCylinderCount > 0){
            this.cylinderCount = xCylinderCount;
        } else {
            this.cylinderCount = 1;
            System.out.println("Invalid cylinder count. Count set to 1.");
        }
    }

    public void setOwner(String xOwner){
        this.owner = xOwner;
    }

    //methods

    public boolean equals(Vehicle xVehicle){
        return this.manufacturer.equals(xVehicle.getManufacturer()) && this.owner.equals(xVehicle.getOwner()) && this.cylinderCount == xVehicle.getCylinderCount();
    }

    public String toString(){
        return "Manufacturer: " + this.manufacturer + "\nCylinder Count: " + this.cylinderCount + "\nOwner: " + this.owner;
    }
}
