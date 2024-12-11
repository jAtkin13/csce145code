//Jack Atkinson
public class CargoShip extends Ship {
    private int tonnage;
    private int maxSpeed;

    public CargoShip() {
        this.tonnage = 0;
        this.maxSpeed = 0;
    }

    public CargoShip(String xShipName, int xTonnage, int xSpeed) {
        this.setShipName(xShipName);
        this.setTonnage(xTonnage);
        this.setMaxSpeed(xSpeed);
    }

    //getters
    public int getTonnage() {
        return this.tonnage;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    //setters
    public void setTonnage(int xTonnage) {
        if (xTonnage >= 0) {
            this.tonnage = xTonnage;
        } else {
            this.tonnage = 0;
            System.out.println("Tonnage cannot be negative. Set to Default (0).");
        }
    }

    public void setMaxSpeed(int xSpeed) {
        if (xSpeed >= 0) {
            this.maxSpeed = xSpeed;
        } else {
            this.maxSpeed = 0;
            System.out.println("Max Speed cannot be negative. Set to Default (0).");
        }
    }

    //toString
    public String toString() {
        return "Ship Name: " + this.getShipName() + "\nTonnage: " + this.tonnage + "\nMax Speed: " + this.maxSpeed;
    }
}
