//Jack Atkinson
public class Ship {
    private String shipName;
    private String shipLaunch;

    public Ship(){
        this.shipName = "Unknown";
        this.shipLaunch = "01/01/1990";
    }

    public Ship(String xName, String xLaunch){
        this.shipName = xName;
        setShipLaunchDate(xLaunch);
    }

    //getters
    public String getShipName() {
        return this.shipName;
    }

    public String getShipLaunchDate() {
        return this.shipLaunch;
    }

    //setters
    public void setShipName(String xName) {
        this.shipName = xName;
    }

    public void setShipLaunchDate(String xLaunch) {
        String[] date = xLaunch.split("/");
        if (date.length == 3) {
            if (Integer.parseInt(date[2]) >= 1990 && Integer.parseInt(date[2]) <= 2019) {
                this.shipLaunch = xLaunch;
            } else {
                this.shipLaunch = "01/01/1990";
                System.out.println("Invalid year of launch. Set to default of 01/01/1990");
            }
        } else {
            this.shipLaunch = "01/01/1990";
            System.out.println("Invalid date format. Set to default of 01/01/1990");
        }
    }

    //toString
    public String toString(){
        return "Ship Name: " + this.shipName + "\nLaunch Date: " + this.shipLaunch;
    }
}
