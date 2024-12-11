//Jack Atkinson
public class CruiseShip extends Ship {
    private int passengerCapacity;
    private int crewCapacity;

    public CruiseShip() {
        this.passengerCapacity = 0;
        this.crewCapacity = 0;
    }

    public CruiseShip(String xShipName, int xPassCap, int xCrewCap) {
        this.setShipName(xShipName);
        this.setPassengerCapacity(xPassCap);
        this.setCrewCapacity(xCrewCap);
    }

    //getters
    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    public int getCrewCapacity() {
        return this.crewCapacity;
    }

    //setters
    public void setPassengerCapacity(int xPassCap) {
        if (xPassCap >= 0) {
            this.passengerCapacity = xPassCap;
        } else {
            this.passengerCapacity = 0;
            System.out.println("Passenger Capacity cannot be negative. Set to Default (0).");
        }

    }

    public void setCrewCapacity(int xCrewCap) {
        if (xCrewCap >= 0) {
            this.crewCapacity = xCrewCap;
        } else {
            this.crewCapacity = 0;
            System.out.println("Crew Capacity cannot be negative. Set to Default (0).");
        }
    }

    //toString
    public String toString() {
        return "Ship Name: " + this.getShipName() + "\nPassenger Capacity: " + this.passengerCapacity + "\nCrew On Board: " + this.crewCapacity;
    }
}
