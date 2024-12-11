//Jack Atkinson

public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;

    public Truck() {
        this.setManufacturer("Unknown");
        this.setCylinderCount(1);
        this.setOwner("Unknown");
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    public Truck(String xManu, int xCylinder, String xOwner, double xLoad, double xTow) {
        this.setManufacturer(xManu);
        this.setCylinderCount(xCylinder);
        this.setOwner(xOwner);
        this.setLoadCapacity(xLoad);
        this.setTowingCapacity(xTow);
    }

    //getters
    public double getLoadCapacity() {
        return this.loadCapacity;
    }

    public double getTowingCapacity() {
        return this.towingCapacity;
    }

    //setters
    public void setLoadCapacity(double xLoad) {
        if (loadCapacity >= 0.0) {
            this.loadCapacity = xLoad;
        } else {
            this.loadCapacity = 0.0;
            System.out.println("Load Capacity cannot be less than 0.");
        }
    }

    public void setTowingCapacity(double xTow) {
        if (towingCapacity >= 0.0) {
            this.towingCapacity = xTow;
        } else {
            this.towingCapacity = 0.0;
            System.out.println("Towing Capacity cannot be less than 0.");
        }
    }

    //methods
    public boolean equals(Truck truck) {
        return this.getManufacturer().equals(truck.getManufacturer()) && this.getCylinderCount() == truck.getCylinderCount() && this.getOwner().equals(truck.getOwner()) && this.loadCapacity == truck.getLoadCapacity() && this.towingCapacity == truck.getTowingCapacity();
    }

    public String toString() {
        return "Manufacturer: " + this.getManufacturer() + "\nCylinder Count: " + this.getCylinderCount() + "\nOwner: " + this.getOwner() + "\nLoad Capacity: " + this.getLoadCapacity() + "\nTowing Capacity: " + this.getTowingCapacity();
    }
}