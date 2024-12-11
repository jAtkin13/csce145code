//Jack Atkinson

public class Car extends Vehicle {
    private double gasMileage;
    private int passengerCount;

    public Car(){
        this.setManufacturer("Unknown");
        this.setCylinderCount(1);
        this.setOwner("Unknown");
        this.gasMileage = 0.0;
        this.passengerCount = 0;
    }

    public Car (String xManu, int xCylinder, String xOwner, double xGasMileage, int xPassengerCount){
        this.setManufacturer(xManu);
        this.setCylinderCount(xCylinder);
        this.setOwner(xOwner);
        this.setGasMileage(xGasMileage);
        this.setPassengerCount(xPassengerCount);
    }

    //getters
    public double getGasMileage() {
        return gasMileage;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    //setters
    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            this.gasMileage = 0.0;
            System.out.println("Invalid gas mileage. Set to 0.");
        }
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount >= 0) {
            this.passengerCount = passengerCount;
        } else {
            this.passengerCount = 0;
            System.out.println("Invalid passenger count. Set to 0.");
        }
    }

    //methods
    public boolean equals (Car car){
        return this.getManufacturer().equals(car.getManufacturer()) && this.getCylinderCount() == car.getCylinderCount() && this.getOwner().equals(car.getManufacturer()) && this.getGasMileage() == car.getGasMileage() && this.getPassengerCount() == car.getPassengerCount();
    }

    public String toString(){
        return "Manufacturer: " + this.getManufacturer() + "\nCylinder Count: " + this.getCylinderCount() + "\nOwner: " + this.getOwner() + "\nGas Mileage: " + this.getGasMileage() + "\nPassenger Count: " + this.getPassengerCount();
    }
}
